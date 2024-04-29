package calculator;

public class DivideOperator implements Operator {
    public int operate(int num1, int num2) throws ArithmeticException {
        if (0 == num2) throw new ArithmeticException("분모(두번째 정수)에는 0이 올 수 없습니다.");
        return num1 / num2;
    }
}
