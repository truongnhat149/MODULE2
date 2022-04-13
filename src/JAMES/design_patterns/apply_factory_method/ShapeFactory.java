package exercise_james.design_patterns.apply_factory_method;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("square".equals(type)) {
           return new Square();
        } else if ("circle".equals(type)) {
            return new Circle();
        } else
            return new Rectangle();

    }
}
