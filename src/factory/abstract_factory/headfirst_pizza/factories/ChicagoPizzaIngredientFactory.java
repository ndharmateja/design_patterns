package factory.abstract_factory.headfirst_pizza.factories;

import factory.abstract_factory.headfirst_pizza.components.cheese.Cheese;
import factory.abstract_factory.headfirst_pizza.components.cheese.MozzarellaCheese;
import factory.abstract_factory.headfirst_pizza.components.clams.Clams;
import factory.abstract_factory.headfirst_pizza.components.clams.FrozenClams;
import factory.abstract_factory.headfirst_pizza.components.dough.Dough;
import factory.abstract_factory.headfirst_pizza.components.dough.ThickCrustDough;
import factory.abstract_factory.headfirst_pizza.components.pepperoni.Pepperoni;
import factory.abstract_factory.headfirst_pizza.components.pepperoni.SlicedPepperoni;
import factory.abstract_factory.headfirst_pizza.components.sauce.PlumTomatoSauce;
import factory.abstract_factory.headfirst_pizza.components.sauce.Sauce;
import factory.abstract_factory.headfirst_pizza.components.veggies.BlackOlives;
import factory.abstract_factory.headfirst_pizza.components.veggies.Eggplant;
import factory.abstract_factory.headfirst_pizza.components.veggies.Spinach;
import factory.abstract_factory.headfirst_pizza.components.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
		implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
				new Spinach(),
				new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
