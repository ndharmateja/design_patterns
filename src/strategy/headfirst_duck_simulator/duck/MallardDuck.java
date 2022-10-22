package strategy.headfirst_duck_simulator.duck;

import strategy.headfirst_duck_simulator.fly.FlyWithWings;
import strategy.headfirst_duck_simulator.quack.Quack;

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
