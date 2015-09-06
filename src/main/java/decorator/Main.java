package decorator;

import decorator.beverages.Expresso;
import decorator.beverages.HouseBlend;
import decorator.condiments.Mocha;
import decorator.condiments.Whip;

/**
 * Created by root on 06.09.15.
 */
public class Main {
    public static void main(String... args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
