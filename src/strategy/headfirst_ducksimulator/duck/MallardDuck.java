package strategy.headfirst_ducksimulator.duck;

import strategy.headfirst_ducksimulator.fly.FlyWithWings;
import strategy.headfirst_ducksimulator.quack.Quack;

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
