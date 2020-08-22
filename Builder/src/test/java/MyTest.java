import kfcwaiter.Waiter;
import meal.Meal;
import mealbuilder.MealBuilder;
import mealbuilder.SubMealBuilderA;
import mealbuilder.SubMealBuilderB;

public class MyTest {

    public static void main(String args[]) {
        MealBuilder mealBuilder = new SubMealBuilderA();
        Waiter waiter = new Waiter();
        waiter.setMealBuilder(mealBuilder);
        waiter.construct();
        Meal meal = waiter.getMeal();
        System.out.println(meal.toString());

        mealBuilder = new SubMealBuilderB();
        waiter.setMealBuilder(mealBuilder);
        waiter.construct();
        meal = waiter.getMeal();
        System.out.println(meal.toString());
    }
}
