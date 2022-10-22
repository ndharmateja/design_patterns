package strategy.headfirst_duck_simulator.quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
