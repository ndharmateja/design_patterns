package factory.abstract_factory.headfirst_pizza.factories;

import factory.abstract_factory.headfirst_pizza.components.cheese.Cheese;
import factory.abstract_factory.headfirst_pizza.components.cheese.ReggianoCheese;
import factory.abstract_factory.headfirst_pizza.components.clams.Clams;
import factory.abstract_factory.headfirst_pizza.components.clams.FreshClams;
import factory.abstract_factory.headfirst_pizza.components.dough.Dough;
import factory.abstract_factory.headfirst_pizza.components.dough.ThinCrustDough;
import factory.abstract_factory.headfirst_pizza.components.pepperoni.Pepperoni;
import factory.abstract_factory.headfirst_pizza.components.pepperoni.SlicedPepperoni;
import factory.abstract_factory.headfirst_pizza.components.sauce.MarinaraSauce;
import factory.abstract_factory.headfirst_pizza.components.sauce.Sauce;
import factory.abstract_factory.headfirst_pizza.components.veggies.Garlic;
import factory.abstract_factory.headfirst_pizza.components.veggies.Mushroom;
import factory.abstract_factory.headfirst_pizza.components.veggies.Onion;
import factory.abstract_factory.headfirst_pizza.components.veggies.RedPepper;
import factory.abstract_factory.headfirst_pizza.components.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
