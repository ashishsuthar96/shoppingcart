package com.cart;

public class BuyXgetYItems implements Offer {
    private int X;
    private int Y;

    public BuyXgetYItems(int x, int y) {
        X=x;
        Y=y;
    }
    public int getX() {
        return X;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public void applyOffer(Product product) {
        if(product.getQuantity()>=X){
            int freeProductQty = product.getQuantity()/(X + Y);
            double unitPrice = product.getPrice()/ product.getQuantity();
            double discount = unitPrice * freeProductQty;
            product.setPrice(product.getPrice() - discount);
        }
    }

}
