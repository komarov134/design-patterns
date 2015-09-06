package factory.abstractfactory;

import factory.abstractfactory.pizzastores.ChicagoPizzaStore;
import factory.abstractfactory.pizzastores.NYPizzaStore;

/**
 * Created by root on 06.09.15.
 */
public class Main {
    public static void main(String... args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
