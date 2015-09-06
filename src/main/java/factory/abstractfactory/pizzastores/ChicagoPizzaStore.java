package factory.abstractfactory.pizzastores;

import factory.abstractfactory.*;
import factory.abstractfactory.ingredienfactories.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.pizzas.PepperoniPizza;

/**
 * Created by root on 06.09.15.
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        } /*else if ... another pizza*/
        return pizza;
    }
}
