package decorator.beverages;

import decorator.Beverage;

/**
 * Created by root on 06.09.15.
 */
public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
