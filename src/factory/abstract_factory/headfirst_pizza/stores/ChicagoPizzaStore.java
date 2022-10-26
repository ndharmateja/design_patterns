package factory.abstract_factory.headfirst_pizza.stores;

import factory.abstract_factory.headfirst_pizza.factories.ChicagoPizzaIngredientFactory;
import factory.abstract_factory.headfirst_pizza.factories.PizzaIngredientFactory;
import factory.abstract_factory.headfirst_pizza.pizzas.CheesePizza;
import factory.abstract_factory.headfirst_pizza.pizzas.ClamPizza;
import factory.abstract_factory.headfirst_pizza.pizzas.PepperoniPizza;
import factory.abstract_factory.headfirst_pizza.pizzas.Pizza;
import factory.abstract_factory.headfirst_pizza.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
