package calculator;

public class AddOperator implements Operator {
    public double operate(int num1, int num2) {
        return (double)num1 + num2;
    }
}
