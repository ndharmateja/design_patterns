package decorator.headfirst_starbuzz.decorators;

import decorator.headfirst_starbuzz.beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, Steamed Milk", this.beverage.getDescription());
    }

}
