package factory.abstractfactory.pizzas;

import factory.abstractfactory.Pizza;
import factory.abstractfactory.PizzaIngredientFactory;

/**
 * Created by root on 06.09.15.
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
