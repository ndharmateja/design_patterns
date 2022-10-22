package decorator.headfirst_starbuzz.beverages;

public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}