package factory.abstractfactory.ingredienfactories;

import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.ingredients.*;
import factory.abstractfactory.ingredients.cheese.Cheese2;
import factory.abstractfactory.ingredients.clams.Clams2;
import factory.abstractfactory.ingredients.dough.Dough1;
import factory.abstractfactory.ingredients.pepperoni.Pepperoni1;
import factory.abstractfactory.ingredients.sauce.Sauce1;
import factory.abstractfactory.ingredients.veggies.RedPepper;
import factory.abstractfactory.ingredients.veggies.Spinach;

/**
 * Created by root on 06.09.15.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
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
        return new Cheese2();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new RedPepper(), new Spinach() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni1();
    }

    @Override
    public Clams createClam() {
        return new Clams2();
    }
}
