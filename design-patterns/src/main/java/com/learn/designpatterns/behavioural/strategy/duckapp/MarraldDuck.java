package com.learn.designpatterns.behavioural.strategy.duckapp;

public class MarraldDuck extends Duck{
    public MarraldDuck(){}

    public MarraldDuck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour){
        super(quackBehaviour, flyBehaviour);
    }
    public void display(){
        System.out.println("looks like Rubber duck");
    }
}
