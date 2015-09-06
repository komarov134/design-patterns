package factory.factorymethod.pizzastore;

import factory.factorymethod.Pizza;
import factory.factorymethod.PizzaStore;
import factory.factorymethod.pizzas.nystyle.*;

/**
 * Created by root on 06.09.15.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
