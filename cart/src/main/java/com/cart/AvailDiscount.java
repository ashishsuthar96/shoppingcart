package com.cart;

public class AvailDiscount implements Discount {
    double X;
    public AvailDiscount(double x) {
        X=x;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    @Override
    public double applyDiscount(double d) {
        double value=0;
        if (X >=100) {
            value = d+X;
        }
        else if (d <500) {
            value = d + X;
        }
        else if(d>500){
            value =d;
        }
        return value;
    }
}
