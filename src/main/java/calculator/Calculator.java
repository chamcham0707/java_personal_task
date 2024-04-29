package calculator;

import java.util.LinkedList;

public class Calculator {

    private static final double PI = 3.141592;

    private LinkedList<Double> results;

    // 원
    private LinkedList<Double> circleArea;

    public Calculator() {
        results = new LinkedList<Double>();
        circleArea = new LinkedList<Double>();
    }

    public Calculator(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        results = new LinkedList<Double>();

        switch(operator) {
            case '+': results.add((double)num1 + num2); break;
            case '-': results.add((double)num1 - num2); break;
            case '*': results.add((double)num1 * num2); break;
            case '/': results.add((double)num1 / num2); break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다. ");
        }
    }

    public void calculate(int num1, int num2, char operator) throws ArithmeticException, OperatorException {
        switch(operator) {
            case '+': results.add((double)num1 + num2); break;
            case '-': results.add((double)num1 - num2); break;
            case '*': results.add((double)num1 * num2); break;
            case '/': results.add((double)num1 / num2); break;
            default: throw new OperatorException("잘못된 사칙연산 기호입니다. ");
        }
    }

    public double resultGetter(int index) { // 해당 index의 값을 반환해준다.
        return results.get(index);
    }

    public double resultGetLast() { // result list의 마지막 값을 반환해준다.
        return results.getLast();
    }

    public void resultSetter(int index, double element) { // result list에 해당 index에 element 값을 넣어준다.
        results.set(index, element);
    }

    public int resultSize() { // result의 크기를 반환해준다.
        return results.size();
    }

    public void removeResult() { // result list에서 첫번째 인덱스를 삭제한다.
        results.removeFirst();
    }

    public void inquiryResults() {
        System.out.print("[ ");
        for (double d : results)
            System.out.print(d + " ");
        System.out.println("]");
    }

    public void calculateCircleArea(int radius) {
        circleArea.add(radius * radius * PI);
    }

    public double circleGetter(int index) {
        return circleArea.get(index);
    }

    public double circleGetLast() {
        return circleArea.getLast();
    }

    public void circleSetter(int index, double element) {
        circleArea.set(index, element);
    }

    public void inquiryCircle() {
        System.out.print("[ ");
        for (double d : circleArea)
            System.out.print(d + " ");
        System.out.println("]");
    }
}