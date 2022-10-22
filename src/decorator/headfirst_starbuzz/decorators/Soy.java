package decorator.headfirst_starbuzz.decorators;

import decorator.headfirst_starbuzz.beverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, Soy", this.beverage.getDescription());
    }

}
