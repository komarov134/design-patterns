package strategy.client.ducks;

import strategy.client.Duck;
import strategy.encapsulation.fly.algorithms.FlyWithWings;
import strategy.encapsulation.quack.algorithms.Quack;

/**
 * Created by root on 29.08.15.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
