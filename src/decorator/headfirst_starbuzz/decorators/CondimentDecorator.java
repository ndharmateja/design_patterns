package decorator.headfirst_starbuzz.decorators;

import decorator.headfirst_starbuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
