package calculator;

// 숫자로 받을 것이기 때문에 extends를 통해 제약을 주었다.
public class AddOperator<T extends Number> implements Operator<T> {
    public final Class<T> type;

    public AddOperator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T operate(T num1, T num2) {
        double result = num1.doubleValue() + num2.doubleValue();
        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
