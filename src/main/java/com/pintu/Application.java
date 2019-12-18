package com.pintu;

import com.pintu.stage0.Duck;
import com.pintu.stage0.MallardDuck;
import com.pintu.stage0.RubberDuck;
import com.pintu.stage1.RedHeadDuck;
import com.pintu.stage3.FlyRocketPowered;
import com.pintu.stage3.ModelDuck;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a choice");
        System.out.println("Stage 1");
        System.out.println("Stage 2");
        System.out.println("Stage 3");
        final int choice = scanner.nextInt();
        if (choice == 1) {
            final Duck mallardDuck = new MallardDuck();
            mallardDuck.quack();
            mallardDuck.display();
            final Duck rubberDuck = new RubberDuck();
            rubberDuck.quack();//overridden to squeak
            rubberDuck.fly();//rubber duck should not be flying.
        } else if (choice == 2) {
            final com.pintu.stage1.RubberDuck rubberDuck = new com.pintu.stage1.RubberDuck();
            rubberDuck.display();
            rubberDuck.swim();
            final RedHeadDuck redHeadDuck = new RedHeadDuck();
            redHeadDuck.display();
            redHeadDuck.fly();
            redHeadDuck.quack();
            final com.pintu.stage1.DecoyDuck decoyDuck = new com.pintu.stage1.DecoyDuck();
            decoyDuck.display();
            decoyDuck.swim();
        } else if (choice == 3) {
            final com.pintu.stage3.Duck duck = new com.pintu.stage3.MallardDuck();
            duck.display();
            duck.performFly();
            duck.performQuack();

            final com.pintu.stage3.Duck modelDuck = new ModelDuck();
            modelDuck.display();
            modelDuck.performQuack();
            modelDuck.performFly();
            modelDuck.setFlyingBehaviour(new FlyRocketPowered());
            modelDuck.performFly();
        } else {
            throw new IllegalArgumentException("Enter a valid option");
        }
        scanner.close();
    }
}
