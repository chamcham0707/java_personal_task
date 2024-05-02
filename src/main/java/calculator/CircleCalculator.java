package calculator;


public class CircleCalculator extends Calculator {

    // 절대 변하지 않는 값이고,
    // 모든 인스턴스들이 같은 값을 가져야하므로 static final로 선언하였다.
    // 또한, 외부에서 접근해서 바꿀 이유도 없어서 private으로 선언하였다.
    private static final double PI = 3.141592;

    public double calculate(double radius) {
        return radius * radius * PI;
    }
}
