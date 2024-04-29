package calculator;

public class ArithmeticCalculator extends Calculator {

    Operator[] operator;

    public ArithmeticCalculator() {
        super();

        operator = new Operator[]{new AddOperator(), new SubtractOperator(), new MultiplyOperator(), new DivideOperator()};
    }

    public void calculate() throws ArithmeticException, OperatorException {
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num1 = sc.nextInt();
        System.out.print("연산자를 입력해주세요: ");
        char operation = sc.next().charAt(0);
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num2 = sc.nextInt();

        double result = 0;
        switch(operation) {
            case '+': result = operator[0].operate(num1, num2); break;
            case '-': result = operator[1].operate(num1, num2); break;
            case '*': result = operator[2].operate(num1, num2); break;
            case '/': result = operator[3].operate(num1, num2); break;
            default: throw new OperatorException("잘못된 연산자입니다.");
        }

        setResults(result);

        System.out.println("결과: " + getLastResult());
    }
}
