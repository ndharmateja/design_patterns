package strategy.headfirst_ex1;

import strategy.headfirst_ex1.duck.Duck;
import strategy.headfirst_ex1.duck.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
