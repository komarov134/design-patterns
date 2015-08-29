package strategy;

import strategy.client.Duck;
import strategy.client.ducks.MallardDuck;
import strategy.encapsulation.quack.algorithms.Squeak;

/**
 * Created by root on 29.08.15.
 */
public class Main {

    public static void main(String... args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setQuackBehaviour(new Squeak());
        mallard.performQuack();
    }
}
