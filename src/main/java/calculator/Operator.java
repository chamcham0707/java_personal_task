package calculator;

// Double과 Integer 상관없이 받기 위하여 제네릭으로 선언
public interface Operator<T> {
    double operate(T num1, T num2);
}
