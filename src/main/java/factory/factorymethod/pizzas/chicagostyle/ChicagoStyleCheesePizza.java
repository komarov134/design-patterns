package factory.factorymethod.pizzas.chicagostyle;

import factory.factorymethod.Pizza;

/**
 * Created by root on 06.09.15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
