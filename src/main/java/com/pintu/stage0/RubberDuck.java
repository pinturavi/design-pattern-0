package com.pintu.stage0;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {
        sqeack();
    }

    private void sqeack() {
        System.out.println("sqeacking..");
    }
}
