package com.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product>  list= new ArrayList<Product>();

    double total;
    private Offer offer;
    private Discount discount;

    public int getProductCount(){
    return list.size();
}

    public void addProduct(Product product) {
        if(offer != null){
            offer.applyOffer(product);
        }
        list.add(product);
    }

    public double getTotalCartValue() {
        if(list.size()>0){
            for(Product product1: list){
                total= total+ product1.getPrice();}
        }
        if(discount!=null)
        {total = discount.applyDiscount(total);
            return total;
        }
         else
             return total;
    }

    public void setOffer(Offer offer) {
       this.offer= offer;
    }

    public void setDiscount(Discount discount) {
        this.discount=discount;
    }
}
