package exercise_james.behavioral_design_pattern.implements_template;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Meal meal = new HamburgerMeal();
        meal.doMeal();

        System.out.println();

        Meal meal2 = new HamburgerMeal();
        meal2.doMeal();
    }
}
