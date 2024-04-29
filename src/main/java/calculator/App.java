package calculator;

import java.util.Scanner;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        if (sc.hasNextInt()) { // sc.hasNextInt(): 정수값인지 확인하는 함수
            num1 = sc.nextInt();
        } else {
            System.out.println("정수를 입력하세요.");
            return;
        }
        System.out.print("두 번째 숫자를 입력하세요: ");
        if (sc.hasNextInt()) {
            num2 = sc.nextInt();
        } else {
            System.out.println("정수를 입력하세요");
            return;
        }
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        double result = 0;
        try {
            result = calculator.calculate(num1, num2, operator);
        } catch(ArithmeticException e) { // 분모에 0이 들어오면 이쪽으로 들어온다.
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            return;
        } catch(OperatorException e) { // 사칙연산 기호를 잘못 입력했을 경우 들어온다.
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("결과: " + result);
    }
}
