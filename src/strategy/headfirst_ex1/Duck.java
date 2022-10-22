package strategy.headfirst_ex1;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
