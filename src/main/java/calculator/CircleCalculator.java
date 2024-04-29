package calculator;

public class CircleCalculator extends Calculator {
    private static final double PI = 3.141592;
    public void calculate(int radius) {
        results.add(radius * radius * PI);
    }
}
