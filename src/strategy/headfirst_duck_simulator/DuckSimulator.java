package strategy.headfirst_duck_simulator;

import strategy.headfirst_duck_simulator.duck.Duck;
import strategy.headfirst_duck_simulator.duck.MallardDuck;
import strategy.headfirst_duck_simulator.duck.ModelDuck;
import strategy.headfirst_duck_simulator.fly.FlyRocketPowered;

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
