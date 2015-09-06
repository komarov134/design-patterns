package factory.factorymethod.pizzastore;

import factory.factorymethod.Pizza;
import factory.factorymethod.PizzaStore;
import factory.factorymethod.pizzas.chicagostyle.*;

/**
 * Created by root on 06.09.15.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
