package com.pintu.stage1;

public class MallardDuck extends Duck implements Quackable, Flyable{
    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
