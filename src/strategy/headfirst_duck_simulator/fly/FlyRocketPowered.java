package strategy.headfirst_duck_simulator.fly;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying with a rocket.");
    }

}
