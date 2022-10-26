package factory.simple_factory.headfirst_pizza;

import factory.simple_factory.headfirst_pizza.pizzas.CheesePizza;
import factory.simple_factory.headfirst_pizza.pizzas.ClamPizza;
import factory.simple_factory.headfirst_pizza.pizzas.PepperoniPizza;
import factory.simple_factory.headfirst_pizza.pizzas.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else if (type.equals("clam"))
            pizza = new ClamPizza();

        return pizza;
    }
}