package strategy.headfirst_ex1.duck;

import strategy.headfirst_ex1.fly.FlyNoWay;
import strategy.headfirst_ex1.quack.Quack;

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
