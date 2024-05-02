package calculator;

public class OperatorFactory<T extends Number> {

    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;
    RemainderOperator remainderOperator;

    public OperatorFactory(Class<T> type) {
        addOperator = new AddOperator(type);
        subtractOperator = new SubtractOperator(type);
        multiplyOperator = new MultiplyOperator(type);
        divideOperator = new DivideOperator(type);
        remainderOperator = new RemainderOperator(type);
    }

    public Operator<T> findOperatorType(char operator) {
        OperatorType operatorType = OperatorType.findOperator(operator);
        switch (operatorType) {
            case PLUS -> {
                return addOperator;
            }
            case MINUS -> {
                return subtractOperator;
            }
            case MUL -> {
                return multiplyOperator;
            }
            case DIV -> {
                return divideOperator;
            }
            case REM -> {
                return remainderOperator;
            }
        };
        throw new IllegalArgumentException("해당하는 연산자가 없습니다. " + operator);
    }
}
