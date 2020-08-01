package decorator;

import beverage.Beverage;

public abstract class Decorator extends Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
