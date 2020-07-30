package coffee;

import additive.CoffeeAdditive;

public class MiddleCoffee extends RefinedCoffee {
    public MiddleCoffee(CoffeeAdditive coffeeAdditive) {
        super(coffeeAdditive);
    }

    public void orderCoffee(int count) {
        coffeeAdditive.addSomething();
        System.out.println("Order " + count + " middle coffee with " + coffeeAdditive.getClass().getSimpleName());
    }
}
