package com.learn.designpatterns.structural.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage = new SugarDecorator(new CreamDecorator(new DarkRoastCoffee()));
        System.out.println(beverage.getPrice() +" "+ beverage.getDescription());

    }


}
