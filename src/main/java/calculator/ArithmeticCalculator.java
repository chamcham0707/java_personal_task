package calculator;

public class ArithmeticCalculator extends Calculator {
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    public ArithmeticCalculator() {
        super();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }
    public void calculate(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        double answer = 0;

        switch(operator) {
            case '+': answer = addOperator.operate(num1, num2); break;
            case '-': answer = subtractOperator.operate(num1, num2); break;
            case '*': answer = multiplyOperator.operate(num1, num2); break;
            case '/': answer = divideOperator.operate(num1, num2); break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다.");
        }

        results.add(answer);
    }
}
