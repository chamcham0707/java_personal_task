package calculator;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

public abstract class Calculator {
    LinkedList<Double> results;

    static Scanner sc = new Scanner(System.in);

    public Calculator() {
        results = new LinkedList<Double>();
    }

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

    public void inquiryLarge() {
        System.out.print("어떤 숫자보다 큰 값들을 출력할까요? ");
        double num = sc.nextDouble();

        // stream과 람다식을 이용하여 특정 숫자보다 큰 값을 출력하도록 하였다.
        Stream<Double> stream = results.stream();
        stream.filter(d -> d > num).forEach(d -> System.out.print(d + " "));
        System.out.println();
    }
}