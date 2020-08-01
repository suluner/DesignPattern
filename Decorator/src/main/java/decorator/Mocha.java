package decorator;

import beverage.Beverage;

public class Mocha extends Decorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public int getCost() {
        return 5 + this.beverage.getCost();
    }
}
