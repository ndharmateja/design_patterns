package strategy.headfirst_ducksimulator.duck;

import strategy.headfirst_ducksimulator.fly.FlyNoWay;
import strategy.headfirst_ducksimulator.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }

}
