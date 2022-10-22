package strategy.headfirst_duck_simulator.quack;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
