package strategy.headfirst_ducksimulator.duck;

import strategy.headfirst_ducksimulator.fly.FlyBehaviour;
import strategy.headfirst_ducksimulator.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
