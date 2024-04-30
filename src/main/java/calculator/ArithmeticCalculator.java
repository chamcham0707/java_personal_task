package calculator;

public class ArithmeticCalculator extends Calculator {
    Operator[] operator;

    OperatorType operatorType;

    public ArithmeticCalculator() {
        super();

        operator = new Operator[]{new AddOperator(), new SubtractOperator(), new MultiplyOperator(), new DivideOperator(), new RemainderOperator()};
    }

    public void calculate() throws ArithmeticException, OperatorException {
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        double num1 = sc.nextDouble();
        System.out.print("연산자를 입력해주세요: ");
        operatorType = OperatorType.findOperator(sc.next());
        System.out.print("두 번째 숫자를 입력해주세요: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (operatorType) {
            case PLUS: result = operator[0].operate(num1, num2); break;
            case MINUS: result = operator[1].operate(num1, num2); break;
            case MUL: result = operator[2].operate(num1, num2); break;
            case DIV: result = operator[3].operate(num1, num2); break;
            case REM: result = operator[3].operate(num1, num2); break;
            default: throw new OperatorException("잘못된 연산자입니다.");
        }

        setResults(result);

        System.out.println("결과: " + getLastResult());
    }
}
