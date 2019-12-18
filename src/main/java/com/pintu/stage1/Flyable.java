package com.pintu.stage1;

public interface Flyable {
   default void fly(){
       System.out.println("flying..");
   }
}
