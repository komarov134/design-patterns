package strategy.client.ducks;

import strategy.client.Duck;

/**
 * Created by root on 29.08.15.
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }
}
