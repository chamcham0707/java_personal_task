package calculator;

public class DivideOperator<T extends Number> implements Operator<T> {
    public double operate(T num1, T num2) throws ArithmeticException {
        if (0 == num2.doubleValue()) throw new ArithmeticException("분모(두번째 정수)에는 0이 올 수 없습니다.");
        return num1.doubleValue() / num2.doubleValue();
    }
}
