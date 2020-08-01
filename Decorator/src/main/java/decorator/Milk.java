package decorator;

import beverage.Beverage;
import beverage.DarkRoast;

public class Milk extends Decorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public int getCost() {
        return 4 + this.beverage.getCost();
    }
}
