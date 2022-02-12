package exercise_james.design_patterns.apply_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        System.out.println("is " + shape.draw());

        Shape shape2 = shapeFactory.getShape("square");
        System.out.println("ís " + shape2.draw());
    }
}
