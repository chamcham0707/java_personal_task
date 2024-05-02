package calculator;

public class RemainderOperator<T extends Number> implements Operator<T> {
    public final Class<T> type;

    public RemainderOperator(Class<T> type) {
        this.type = type;
    }

    public T operate(T num1, T num2) {
        double result = num1.doubleValue() % num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
