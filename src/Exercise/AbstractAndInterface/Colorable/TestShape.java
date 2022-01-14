package Exercise.AbstractAndInterface.Colorable;

public class TestShape {
    public static void main(String[] args) {

        // tạo mảng chứa các đối tượng
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(12);
        shapes[2] = new Rectangle(4,6);

        // in ra mảng + diện tích
        System.out.println("area of elements in array");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Colorable colorable = (Square) shape;
                colorable.howtoColor();
            }
        }
    }
}
