package com.pintu.stage3;

public abstract class Duck {

    private QuackingBehaviour quackingBehaviour;
    private FlyingBehaviour flyingBehaviour;

    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    protected Duck(QuackingBehaviour quackingBehaviour, FlyingBehaviour flyingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
        this.flyingBehaviour = flyingBehaviour;
    }

    public abstract void display();

    public void swim(){
        System.out.println("swimming..");
    }

    public void performQuack(){
        quackingBehaviour.quack();
    }

    public void performFly() {
        flyingBehaviour.fly();
    }
}
