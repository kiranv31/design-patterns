package com.learn.designpatterns.behavioural.strategy.duckapp;

public class DecoyDuck extends Duck{
    public DecoyDuck(){}

    public DecoyDuck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour){
        super(quackBehaviour, flyBehaviour);
    }

    @Override
    public void display(){
        System.out.println("looks like Rubber duck");
    }
}
