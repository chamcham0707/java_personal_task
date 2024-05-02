package calculator;

public class ArithmeticCalculator<T extends Number> extends Calculator {
    public final Class<T> type;

    OperatorType operatorType;
    OperatorFactory operatorFactory;

    public ArithmeticCalculator(Class<T> type) {
        super();

        operatorFactory = new OperatorFactory(type);
        this.type = type;
    }

    public T calculate(double num1, double num2, char operator) throws ArithmeticException, OperatorException {
        return (T) operatorFactory.findOperatorType(operator).operate(num1, num2);
    }
}