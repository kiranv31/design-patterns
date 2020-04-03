package com.learn.designpatterns.behavioural.strategy.duckapp;

public abstract class Duck {
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    public Duck() {
    }

    public Duck(QuackBehaviour quackBehaviour, FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void display() {
        System.out.println("I am a duck");
    }

    public void swim() {
        System.out.println("I swim all day");
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

}
