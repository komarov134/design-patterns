package factory.abstractfactory.ingredienfactories;

import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.ingredients.*;
import factory.abstractfactory.ingredients.cheese.Cheese1;
import factory.abstractfactory.ingredients.clams.Clams1;
import factory.abstractfactory.ingredients.dough.Dough1;
import factory.abstractfactory.ingredients.pepperoni.Pepperoni1;
import factory.abstractfactory.ingredients.sauce.Sauce1;
import factory.abstractfactory.ingredients.veggies.BlackOlives;
import factory.abstractfactory.ingredients.veggies.RedPepper;

/**
 * Created by root on 06.09.15.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough1();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce1();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese1();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new RedPepper(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni1();
    }

    @Override
    public Clams createClam() {
        return new Clams1();
    }
}
