package strategy.headfirst_ex1.duck;

import strategy.headfirst_ex1.fly.FlyBehaviour;
import strategy.headfirst_ex1.quack.QuackBehaviour;

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
