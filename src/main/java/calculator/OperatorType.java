package calculator;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MUL('*'),
    DIV('/'),
    REM('%');

    private char operator;

    // 싱글톤 패턴
    OperatorType(char operator) {
        this.operator = operator;
    }

    // 해당 연산자를 찾아주는 것이다.
    public static OperatorType findOperator(char operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getOperator() == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException("해당하는 연산자가 없습니다. " + operator);
    }

    public char getOperator() {
        return operator;
    }
}
