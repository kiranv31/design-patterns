package com.learn.designpatterns.behavioural.strategy.duckapp;

public class RubberDuck extends Duck{
    public RubberDuck(){}

    public RubberDuck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour){
        super(quackBehaviour, flyBehaviour);
    }
    public void display(){
        System.out.println("looks like Rubber duck");
    }
}
