package exercise_james.structural_design_pattern.implements_proxy;

public class Main {
    public static void main(String[] args) {
        MathCalculatorProxy proxy = new MathCalculatorProxy();
        double result = proxy.add(1, 2);
        System.out.printf("1 + 2 = %s " , result);
        result = proxy.add(2, Double.MAX_VALUE);
        System.out.printf("2 + Double.Max_Value = %s ", result);
    }
}
