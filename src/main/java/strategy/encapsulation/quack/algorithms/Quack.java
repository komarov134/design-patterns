package strategy.encapsulation.quack.algorithms;

import strategy.encapsulation.quack.QuackBehaviour;

/**
 * Created by root on 29.08.15.
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
