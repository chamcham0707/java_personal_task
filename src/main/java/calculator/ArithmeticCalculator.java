package calculator;

public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator() {
        super();
    }

    public void calculate(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        switch(operator) {
            case '+': results.add((double)num1 + num2); break;
            case '-': results.add((double)num1 - num2); break;
            case '*': results.add((double)num1 * num2); break;
            case '/': results.add((double)num1 / num2); break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다. ");
        }
    }
}
