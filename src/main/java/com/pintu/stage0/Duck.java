package com.pintu.stage0;

public abstract class Duck {
    public void quack() {
        System.out.println("quacking");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void fly() {
        System.out.println("flying..");
    }

    abstract public void display();
}
