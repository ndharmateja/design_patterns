package strategy.headfirst_duck_simulator.duck;

import strategy.headfirst_duck_simulator.fly.FlyNoWay;
import strategy.headfirst_duck_simulator.quack.Quack;

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
