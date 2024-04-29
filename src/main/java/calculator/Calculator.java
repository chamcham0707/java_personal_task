package calculator;

import java.util.LinkedList;
import java.util.Scanner;

public abstract class Calculator {
    LinkedList<Double> results;

    static Scanner sc = new Scanner(System.in);

    public Calculator() {
        results = new LinkedList<Double>();
    }

    // ArithmeticCalculator class와 CircleCalculator class가 무조건 구현할 수 있도록 추상 메서드로 선언했다.
    abstract void calculate() throws OperatorException;

    // 공통된 메소드이다.
    public double getLastResult() {
        return results.getLast();
    }

    public void setResults(double result) {
        results.add(result);
    }

    public void inquiryResults() {
        System.out.print("[ ");
        for (double d : results)
            System.out.print(d + " ");
        System.out.println("]");
    }

    public void removeResults() {
        inquiryResults();
        System.out.print("몇 번째 값을 삭제하고 싶습니까? ");
        int index = sc.nextInt();
        System.out.print("정말 삭제를 원하시면 remove를 입력해주세요: ");
        String remove = sc.next();
        if (remove.equals("remove")) {
            results.remove(index - 1);
            System.out.println("삭제를 완료했습니다.");
        } else System.out.println("아무것도 삭제하지 않았습니다.");
    }
}