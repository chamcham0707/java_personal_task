package calculator;

import java.util.Scanner;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // Calculator 인스턴스 생성

        Scanner sc = new Scanner(System.in);

        // 반복문을 돌면서 메모리 할당과 삭제를 반복하지 않도록하기 위해 반복문 밖에서 선언
        int num1, num2;
        char operator;
        String repeat, firstRemove, inquiry;
        while (true) {
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

            // 음수를 입력할 시 프로그램이 종료된다.
            if (num1 < 0 || num2 < 0) {
                System.out.println("양의 정수를 입력해주세요.");
                return;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            // sc.next(): 입력받은 것을 String으로 받아온다.
            // charAt(int index): String의 String[index] 값을 가져와준다.
            operator = sc.next().charAt(0);

            try {
                calculator.calculate(num1, num2, operator);
            } catch(ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 올 수 없습니다.");
                continue;
            } catch(OperatorException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("결과: " + calculator.resultGetLast());

            // 가장 첫번째 값을 삭제한다.
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            firstRemove = sc.next();
            if (firstRemove.equals("remove")) calculator.resultRemove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiry = sc.next();
            if (inquiry.equals("inquiry")) calculator.resultInquiry();

            // exit를 입력하면 while 문을 빠져나가 프로그램 종료
            // exit외의 값이 입력되면 반복해서 계산한다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            repeat = sc.next();
            if (repeat.equals("exit")) break;
        }
    }
}
