package factory.abstract_factory.headfirst_pizza.factories;

import factory.abstract_factory.headfirst_pizza.components.cheese.Cheese;
import factory.abstract_factory.headfirst_pizza.components.clams.Clams;
import factory.abstract_factory.headfirst_pizza.components.dough.Dough;
import factory.abstract_factory.headfirst_pizza.components.pepperoni.Pepperoni;
import factory.abstract_factory.headfirst_pizza.components.sauce.Sauce;
import factory.abstract_factory.headfirst_pizza.components.veggies.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
