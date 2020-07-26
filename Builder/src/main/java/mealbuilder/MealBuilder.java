package mealbuilder;

import meal.Meal;

public interface MealBuilder {
    public void buildFood();
    public void buildDrink();
    public Meal getMeal();
}
