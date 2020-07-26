package mealbuilder;

import meal.Meal;

public class SubMealBuilderA implements MealBuilder {
    private Meal meal = new Meal();

    public void buildFood() {
        this.meal.setFood("Rice");

    }

    public void buildDrink() {
        this.meal.setDrink("Cola");
    }

    public Meal getMeal() {
        return this.meal;
    }
}
