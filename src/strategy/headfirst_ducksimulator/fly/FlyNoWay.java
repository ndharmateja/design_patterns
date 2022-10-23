package strategy.headfirst_ducksimulator.fly;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }

}
