package JavaExerciseYouTube.Interface;

public class CalculatorVinaCal500 implements Calculator{
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        if (b == 0) System.out.println("Please re-enter B");

        return a/b;
    }
}
