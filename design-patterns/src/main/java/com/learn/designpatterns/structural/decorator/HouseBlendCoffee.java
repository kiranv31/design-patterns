package com.learn.designpatterns.structural.decorator;

public class HouseBlendCoffee extends Coffee{
    private double price;
    private String description;

    public HouseBlendCoffee(){
        super();
        price = 50;
        description = " House Blend Coffee ";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }


}
