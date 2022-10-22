package strategy.headfirst_ex1;

import strategy.headfirst_ex1.duck.Duck;
import strategy.headfirst_ex1.duck.MallardDuck;
import strategy.headfirst_ex1.duck.ModelDuck;
import strategy.headfirst_ex1.fly.FlyRocketPowered;

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
