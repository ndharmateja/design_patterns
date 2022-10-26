package factory.abstract_factory.headfirst_pizza.stores;

import factory.abstract_factory.headfirst_pizza.pizzas.Pizza;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String item);

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
