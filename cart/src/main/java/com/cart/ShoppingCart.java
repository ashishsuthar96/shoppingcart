package com.cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product>  list= new ArrayList<Product>();
    private double total;
    private Offer offer;

    public int getProductCount(){
    return list.size();
}

    public void addProduct(Product product) {
        if(offer != null){
            offer.applyOffer(product);
        }
        list.add(product);
    }

    public Double getTotalCartValue() {
        if(list.size()>0){
           for(Product productList: list)
           total= total+ productList.getPrice();
        }
        return total;
    }

    public void setOffer(Offer offer) {
       this.offer= offer;
    }
}
