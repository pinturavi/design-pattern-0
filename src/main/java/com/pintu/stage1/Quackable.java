package com.pintu.stage1;

public interface Quackable {
    default void quack() {
        System.out.println("quacking..");
    }
}
