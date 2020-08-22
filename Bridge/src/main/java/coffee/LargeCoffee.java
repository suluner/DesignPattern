package coffee;

import additive.CoffeeAdditive;

public class LargeCoffee extends RefinedCoffee {
    public LargeCoffee(CoffeeAdditive coffeeAdditive) {
        super(coffeeAdditive);
    }

    public void orderCoffee(int count) {
        coffeeAdditive.addSomething();
        System.out.println("Order " + count + " big coffee with " + coffeeAdditive.getClass().getSimpleName());
    }
}
