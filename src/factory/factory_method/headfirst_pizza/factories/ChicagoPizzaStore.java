package factory.factory_method.headfirst_pizza.factories;

import factory.factory_method.headfirst_pizza.pizzas.Pizza;
import factory.factory_method.headfirst_pizza.pizzas.chicago.ChicagoStyleCheesePizza;
import factory.factory_method.headfirst_pizza.pizzas.chicago.ChicagoStyleClamPizza;
import factory.factory_method.headfirst_pizza.pizzas.chicago.ChicagoStylePepperoniPizza;
import factory.factory_method.headfirst_pizza.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        if (type.equals("clam"))
            return new ChicagoStyleClamPizza();
        if (type.equals("pepperoni"))
            return new ChicagoStylePepperoniPizza();
        if (type.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        return null;
    }

}
