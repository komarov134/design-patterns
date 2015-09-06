package factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 06.09.15.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    protected void prepare() {
        System.out.println("Preparing " + name);
    }

    protected void bake() {
        System.out.println("bake");
    }

    protected void cut() {
        System.out.println("cut");
    }

    protected void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
