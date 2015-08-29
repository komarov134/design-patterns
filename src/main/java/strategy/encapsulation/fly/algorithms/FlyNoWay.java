package strategy.encapsulation.fly.algorithms;

import strategy.encapsulation.fly.FlyBehaviour;

/**
 * Created by root on 29.08.15.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}
