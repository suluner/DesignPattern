package mealbuilder;

import meal.Meal;

public class SubMealBuilderB implements MealBuilder {
    private Meal meal = new Meal();

    public void buildFood() {
        this.meal.setFood("Tomato");
    }

    public void buildDrink() {
        this.meal.setDrink("Origin");
    }

    public Meal getMeal() {
        return this.meal;
    }
}