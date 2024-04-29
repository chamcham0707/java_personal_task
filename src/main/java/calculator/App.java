package calculator;

import java.util.Scanner;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 반복문을 돌면서 메모리 할당과 삭제를 반복하지 않도록하기 위해 반복문 밖에서 선언
        int num1, num2;
        char operator;
        LinkedList<Double> result = new LinkedList<Double>(); // 추가와 삭제가 빈번하므로 linkedlist로 선택하였다.
        String repeat, firstRemove, inquiry;
        boolean isLast = false;
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

            switch(operator) {
                case '+': result.add((double)num1 + num2); break;
                case '-': result.add((double)num1 - num2); break;
                case '*': result.add((double)num1 * num2); break;
                case '/':
                    // 분모에 0이 오지 않도록하는 코드
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서는 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }

                    result.add((double)num1 / num2);
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하였습니다. +, -, *, / 중에 하나를 입력하세요.");
            }

            System.out.println("결과: " + result.getLast());

            // 가장 첫번째 값을 삭제한다.
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            firstRemove = sc.next();
            if (firstRemove.equals("remove"))
                result.removeFirst();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inquiry = sc.next();
            if (inquiry.equals("inquiry")) {
                System.out.print("[ ");
                for (double d : result)
                    System.out.print(d + " ");
                System.out.println("]");
            }

            // exit를 입력하면 while문을 빠져나가 프로그램 종료
            // exit외의 값이 입력되면 반복해서 계산한다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            repeat = sc.next();
            if (repeat.equals("exit")) break;
        }
    }
}
