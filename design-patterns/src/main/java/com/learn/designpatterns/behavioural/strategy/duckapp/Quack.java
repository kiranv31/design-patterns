package com.learn.designpatterns.behavioural.strategy.duckapp;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("quack... quack");
    }

}
