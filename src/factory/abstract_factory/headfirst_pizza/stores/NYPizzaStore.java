package factory.abstract_factory.headfirst_pizza.stores;

import factory.abstract_factory.headfirst_pizza.factories.NYPizzaIngredientFactory;
import factory.abstract_factory.headfirst_pizza.factories.PizzaIngredientFactory;
import factory.abstract_factory.headfirst_pizza.pizzas.CheesePizza;
import factory.abstract_factory.headfirst_pizza.pizzas.ClamPizza;
import factory.abstract_factory.headfirst_pizza.pizzas.PepperoniPizza;
import factory.abstract_factory.headfirst_pizza.pizzas.Pizza;
import factory.abstract_factory.headfirst_pizza.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");

		}
		return pizza;
	}
}
