package com.learn.designpatterns.structural.decorator;

public class DarkRoastCoffee extends Coffee{
    private double price;
    private String description;

    public DarkRoastCoffee(){
        super();
        price = 40;
        description = " Dark Roast Coffee ";
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
