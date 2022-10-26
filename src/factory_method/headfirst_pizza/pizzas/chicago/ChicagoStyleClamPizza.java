package factory_method.headfirst_pizza.pizzas.chicago;

import factory_method.headfirst_pizza.pizzas.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}

	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}