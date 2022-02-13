package exercise_james.behavioral_design_pattern.implements_template;

public abstract class Meal {
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();

    public abstract void cook();

    public void eat() {
        System.out.println("Mmmm, that's good");
    }
    public abstract void cleanUp();
}
