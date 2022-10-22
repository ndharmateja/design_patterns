package decorator.headfirst_starbuzz.decorators;

import decorator.headfirst_starbuzz.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, Whip", this.beverage.getDescription());
    }

}
