package vn.lpnt.AccessStaticMethod;

import java.lang.constant.Constable;

public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Vinfast", "vf37");
        System.out.println( car1.getCar() + car1.numberOfCars);
        Car car2 = new Car("Mazda", "Maz5");
        System.out.println(car2.getCar() +  car2.numberOfCars);

    }
    public static class Car {
        private String name;
        private String engine;

        public static int numberOfCars;

        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            numberOfCars++;
        }
        public String getCar() {
            return "Name car: " + this.name + " Engine : " + this.engine;
        }
    }
}
