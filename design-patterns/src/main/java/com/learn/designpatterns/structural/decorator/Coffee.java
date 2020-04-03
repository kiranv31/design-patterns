package com.learn.designpatterns.structural.decorator;

public abstract class Coffee implements Beverage {
    private double price;
    private String description;

    public void setPrice(double d) {
        price = d;
    }

    public void setDescription(String desc) {
        description = desc;
    }

}
