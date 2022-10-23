package strategy.headfirst_ducksimulator;

import strategy.headfirst_ducksimulator.duck.Duck;
import strategy.headfirst_ducksimulator.duck.MallardDuck;
import strategy.headfirst_ducksimulator.duck.ModelDuck;
import strategy.headfirst_ducksimulator.fly.FlyRocketPowered;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
