package decorator.headfirst_starbuzz.decorators;

import decorator.headfirst_starbuzz.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, Mocha", this.beverage.getDescription());
    }

}
