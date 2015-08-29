package strategy.encapsulation.quack.algorithms;

import strategy.encapsulation.quack.QuackBehaviour;

/**
 * Created by root on 29.08.15.
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
