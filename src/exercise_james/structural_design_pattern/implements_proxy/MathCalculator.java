package exercise_james.structural_design_pattern.implements_proxy;

import exercise_james.structural_design_pattern.implements_proxy.Calculator;

public class MathCalculator implements Calculator {
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double sub(double first, double second) {
        return first - second;
    }

    @Override
    public double mul(double first, double second) {
        return first * second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
