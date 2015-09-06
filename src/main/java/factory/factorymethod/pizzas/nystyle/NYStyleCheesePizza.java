package factory.factorymethod.pizzas.nystyle;

import factory.factorymethod.Pizza;

/**
 * Created by root on 06.09.15.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
