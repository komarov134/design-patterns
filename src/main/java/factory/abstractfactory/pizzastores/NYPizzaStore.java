package factory.abstractfactory.pizzastores;

import factory.abstractfactory.*;
import factory.abstractfactory.ingredienfactories.NYPizzaIngredientFactory;
import factory.abstractfactory.pizzas.PepperoniPizza;

/**
 * Created by root on 06.09.15.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } /* else if ... another pizza */
        return pizza;
    }
}
