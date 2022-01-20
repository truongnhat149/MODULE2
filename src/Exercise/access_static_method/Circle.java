package Exercise.access_static_method;

public class Circle {
    // change access modifier
    // mặc định kh thêm gì thì nó là defaut
     double radius = 1.0;
     String color = "red";
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
