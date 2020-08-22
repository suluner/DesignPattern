import beverage.Beverage;
import beverage.DarkRoast;
import decorator.Milk;
import decorator.Mocha;

public class MyTest {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getCost());

        Beverage beverageWithMilk = new Milk(darkRoast);
        System.out.println(beverageWithMilk.getCost());

        Beverage beverageWithMikAndMocha = new Mocha(beverageWithMilk);
        System.out.println(beverageWithMikAndMocha.getCost());
    }
}
