package calculator;

import java.util.LinkedList;

public class Calculator {
    private LinkedList<Double> result = new LinkedList<Double>();

    public void calculate(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        switch(operator) {
            case '+': result.add((double)num1 + num2); break;
            case '-': result.add((double)num1 - num2); break;
            case '*': result.add((double)num1 * num2); break;
            case '/': result.add((double)num1 / num2); break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다. ");
        }
    }

    public double resultGetter(int index) { // 해당 index의 값을 반환해준다.
        return result.get(index);
    }

    public double resultGetLast() { // result list의 마지막 값을 반환해준다.
        return result.getLast();
    }

    public void resultSetter(int index, double element) { // result list에 해당 index에 element 값을 넣어준다.
        result.set(index, element);
    }

    public int resultSize() { // result의 크기를 반환해준다.
        return result.size();
    }

    public void removeResult() { // result list에서 첫번째 인덱스를 삭제한다.
        result.removeFirst();
    }

    public void inquiryResults() {
        System.out.print("[ ");
        for (double d : result)
            System.out.print(d + " ");
        System.out.println("]");
    }
}


