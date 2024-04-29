package calculator;

public class Calculator {
    public double calculate(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        double result = 0;

        switch(operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다. ");
        }

        return result;
    }
}


