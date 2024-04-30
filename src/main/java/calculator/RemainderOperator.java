package calculator;

public class RemainderOperator<T extends Number> implements Operator<T> {
    public double operate(T num1, T num2) {
        return num1.doubleValue() % num2.doubleValue();
    }
}
