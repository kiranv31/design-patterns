package com.learn.designpatterns.behavioural.strategy.duckapp;

public class SilentQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("silentquack... quack");
    }

}
