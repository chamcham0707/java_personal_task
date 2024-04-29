package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        char operator;
        double result;
        String repeat;
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

            result = 0;
            switch(operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    // 분모에 0이 오지 않도록하는 코드
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서는 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        break;
                    }

                    result = (double)num1 / num2;
                    break;
                default:
                    System.out.println("잘못된 연산자를 입력하였습니다. +, -, *, / 중에 하나를 입력하세요.");
            }

            System.out.println("결과: " + result);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            repeat = sc.next();

            // exit를 입력하면 while문을 빠져나가 프로그램 종료
            // exit외의 값이 입력되면 반복해서 계산한다.
            if (repeat.equals("exit")) break;
        }
    }
}
