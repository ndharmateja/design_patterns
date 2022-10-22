package strategy.headfirst_duck_simulator.fly;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }

}
