package coffee;

import additive.CoffeeAdditive;

import java.util.Random;

public abstract class RefinedCoffee extends Coffee {

    public RefinedCoffee(CoffeeAdditive coffeeAdditive) {
        super(coffeeAdditive);
    }

    public void checkQuality(){
        Random ran=new Random();
        System.out.println(String.format("%s 添加%s",coffeeAdditive.getClass().getSimpleName(), ran.nextBoolean()?"太多":"正常"));
    }
}
