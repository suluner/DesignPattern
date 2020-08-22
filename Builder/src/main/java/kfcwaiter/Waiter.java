package kfcwaiter;

import meal.Meal;
import mealbuilder.MealBuilder;

public class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void construct() {
        this.mealBuilder.buildFood();
        this.mealBuilder.buildDrink();
    }

    public Meal getMeal(){
        return this.mealBuilder.getMeal();
    }
}
