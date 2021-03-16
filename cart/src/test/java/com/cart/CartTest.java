package com.cart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {

    ShoppingCart cart;
    @BeforeEach
    void before(){
       cart = new ShoppingCart();
    }


    @Test
    public void emptyCart(){
        Assertions.assertEquals(0,cart.getProductCount());

    }

    @Test
    public void oneProductInCart(){
        Product product = new Product("Gatsby hair cream",1,30.0);
        cart.addProduct(product);
        Assertions.assertEquals(1,cart.getProductCount());
        Assertions.assertEquals(30.0,cart.getTotalCartValue());

    }
    @Test
    public void moreThenOneProductInCart(){
        Product Gatsbyhaircream= new Product("Gatsby hair cream",1,30.0);
        Product soap= new Product("Gatsby hair cream",1,100.0);
        cart.addProduct(Gatsbyhaircream);
        cart.addProduct(soap);
        Assertions.assertEquals(2,cart.getProductCount());
        Assertions.assertEquals(130.0,cart.getTotalCartValue());

    }
    @Test
    public void buyXGetYItemFreeOffer(){
        Offer offer = new BuyXgetYItems(2,1);
        cart.setOffer(offer);
        Product product= new Product("Gatsby hair cream",12,360.0);
        cart.addProduct(product);
        Assertions.assertEquals(1,cart.getProductCount());
        Assertions.assertEquals(240.0,cart.getTotalCartValue());

    }
    @Test
    public void morebuyXGetYItemFreeOffer(){
        Offer offer = new BuyXgetYItems(2,1);
        Product gatsByCream = new Product("Gatsby hair cream", 3, 90.0);
        Product bvlgiriSoap = new Product("Bvlgiri Soap", 2, 200.0);
        cart.setOffer(offer);
        cart.addProduct(gatsByCream);
        cart.setOffer(new NoOffer());//No offer for the Soap
        cart.addProduct(bvlgiriSoap);
        Assertions.assertEquals(2, cart.getProductCount());
        Assertions.assertEquals(260.0, cart.getTotalCartValue(),0.0); }


}
