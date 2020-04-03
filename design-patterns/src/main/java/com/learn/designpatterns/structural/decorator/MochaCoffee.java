package com.learn.designpatterns.structural.decorator;

public class MochaCoffee extends Coffee{
    private double price;
    private String description;

    public MochaCoffee(){
        super();
        price = 60;
        description = " Mocha Coffee ";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDesicription(String description){
        this.description = description;
    }
}
