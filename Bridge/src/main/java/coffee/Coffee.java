package coffee;

import additive.CoffeeAdditive;

public abstract class Coffee {
    protected CoffeeAdditive coffeeAdditive;

    public Coffee(CoffeeAdditive coffeeAdditive) {
        this.coffeeAdditive = coffeeAdditive;
    }

    public abstract void orderCoffee(int count);
}
