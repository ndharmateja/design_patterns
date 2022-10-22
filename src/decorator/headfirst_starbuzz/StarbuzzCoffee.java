package decorator.headfirst_starbuzz;

import decorator.headfirst_starbuzz.beverages.Beverage;
import decorator.headfirst_starbuzz.beverages.DarkRoast;
import decorator.headfirst_starbuzz.beverages.Espresso;
import decorator.headfirst_starbuzz.beverages.HouseBlend;
import decorator.headfirst_starbuzz.decorators.Mocha;
import decorator.headfirst_starbuzz.decorators.Soy;
import decorator.headfirst_starbuzz.decorators.Whip;

public class StarbuzzCoffee {

    private static void printDetails(Beverage bev) {
        System.out.println(String.format("%s: $%.2f", bev.getDescription(), bev.cost()));
    }

    public static void main(String[] args) {
        Beverage bev1 = new Espresso();
        printDetails(bev1);

        Beverage bev2 = new DarkRoast();
        bev2 = new Mocha(bev2);
        bev2 = new Mocha(bev2);
        bev2 = new Whip(bev2);
        printDetails(bev2);

        Beverage bev3 = new HouseBlend();
        bev3 = new Soy(bev3);
        bev3 = new Mocha(bev3);
        bev3 = new Whip(bev3);
        printDetails(bev3);
    }
}
