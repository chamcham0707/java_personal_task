package calculator;

public enum OperatorType {
    PLUS("+"),
    MINUS("-"),
    MUL("*"),
    DIV("/"),
    REM("%");

    private String operator;

    // 싱글톤 패턴
    OperatorType(String operator) {
        this.operator = operator;
    }

    // 해당 연산자를 찾아주는 것이다.
    public static OperatorType findOperator(String operator) {
        for (OperatorType op : OperatorType.values()) {
            if (op.getOperator().equals(operator)) {
                return op;
            }
        }
        throw new RuntimeException();
    }

    public String getOperator() {
        return operator;
    }
}
