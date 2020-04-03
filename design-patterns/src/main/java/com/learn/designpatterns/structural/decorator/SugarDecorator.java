package com.learn.designpatterns.structural.decorator;

public class SugarDecorator implements Beverage{
    private Beverage beverage;
    private double price;
    private String description;
    {
        price = 5.00;
        description = " With Suger ";
    }
    public SugarDecorator(){
        price = 5.00;
        description = " With Suger ";
    }

    public SugarDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getPrice() {
        return beverage.getPrice() + price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }

    public void setDescription(String des){
        description = des;
    }
}
