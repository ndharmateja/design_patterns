package factory_method.headfirst_pizza.factories;

import factory_method.headfirst_pizza.pizzas.Pizza;
import factory_method.headfirst_pizza.pizzas.ny.NYStyleCheesePizza;
import factory_method.headfirst_pizza.pizzas.ny.NYStyleClamPizza;
import factory_method.headfirst_pizza.pizzas.ny.NYStylePepperoniPizza;
import factory_method.headfirst_pizza.pizzas.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYStyleCheesePizza();
        if (type.equals("clam"))
            return new NYStyleClamPizza();
        if (type.equals("pepperoni"))
            return new NYStylePepperoniPizza();
        if (type.equals("veggie"))
            return new NYStyleVeggiePizza();
        return null;
    }
}