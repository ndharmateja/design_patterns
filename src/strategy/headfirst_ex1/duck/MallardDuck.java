package strategy.headfirst_ex1.duck;

import strategy.headfirst_ex1.fly.FlyWithWings;
import strategy.headfirst_ex1.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck.");

    }

}
