package com.cart;

public class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity,double price){
        this.name= name;
        this.price= price;
        this.quantity=quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
