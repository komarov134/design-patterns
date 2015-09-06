package decorator.beverages;

import decorator.Beverage;

/**
 * Created by root on 06.09.15.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
