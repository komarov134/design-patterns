package factory.factorymethod.pizzas.chicagostyle;

import factory.factorymethod.Pizza;

/**
 * Created by root on 06.09.15.
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
