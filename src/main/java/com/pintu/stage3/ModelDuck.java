package com.pintu.stage3;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new Quack(), new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
