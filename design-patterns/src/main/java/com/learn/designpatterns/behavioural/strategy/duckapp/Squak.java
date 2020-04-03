package com.learn.designpatterns.behavioural.strategy.duckapp;

public class Squak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("squack... squack");
    }

}
