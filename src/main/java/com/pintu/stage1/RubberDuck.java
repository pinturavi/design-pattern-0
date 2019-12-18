package com.pintu.stage1;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("rubber duck");
    }

    public void squeak() {
        System.out.println("squeaking..");
    }
}
