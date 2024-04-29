package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("양의 정수를 입력해주세요.");
            return;
        }

        System.out.print("사칙연산 기호를 입력하세요: ");
        // sc.next(): 입력받은 것을 String으로 받아온다.
        // charAt(int index): String의 String[index] 값을 가져와준다.
        char operator = sc.next().charAt(0);

        double result = 0;
        switch(operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서는 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }

                result = (double)num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자를 입력하였습니다.");
        }

        System.out.println("결과: " + result);
    }
}
