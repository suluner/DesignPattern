import additive.Milk;
import additive.Sugar;
import coffee.LargeCoffee;
import coffee.MiddleCoffee;
import coffee.RefinedCoffee;

public class MyTest {
    public static void main(String[] args) {
        RefinedCoffee largeCoffee = new LargeCoffee(new Milk());
        largeCoffee.orderCoffee(2);
        largeCoffee.checkQuality();

        RefinedCoffee middleCoffee = new MiddleCoffee(new Sugar());
        middleCoffee.orderCoffee(2);
        middleCoffee.checkQuality();
    }
}
