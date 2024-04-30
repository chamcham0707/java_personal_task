package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        int input;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. 사칙 연산 계산");
            System.out.println("2. 원의 넓이 계산");
            System.out.println("3. 사칙 연산 결과 조회");
            System.out.println("4. 원의 넓이 결과 조회");
            System.out.println("5. 사칙 연산 결과 지우기");
            System.out.println("6. 원의 넓이 결과 지우기");
            System.out.println("7. 사칙연산 저장 값 중 입력 값보다 큰 값 출력");
            System.out.println("8. 원의 넓이 저장 값 중 입력 값보다 큰 값 출력");
            System.out.println("9. 종료");
            System.out.print("원하는 작업의 번호를 입력해주세요: ");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    try {
                        arithmeticCalculator.calculate();
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    } catch (OperatorException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: circleCalculator.calculate(); break;
                case 3: arithmeticCalculator.inquiryResults(); break;
                case 4: circleCalculator.inquiryResults(); break;
                case 5: arithmeticCalculator.removeResults(); break;
                case 6: circleCalculator.removeResults(); break;
                case 7: arithmeticCalculator.inquiryLarge(); break;
                case 8: circleCalculator.inquiryLarge(); break;
                case 9:
                    System.out.print("정말 종료를 원하시면 exit를 입력해주세요: ");
                    String exit = sc.next();
                    if (exit.equals("exit")) return;
                    System.out.println("종료하지 않았습니다.");
                    break;
                default: System.out.println("1 ~ 7 번호를 입력해주세요.");
            }
        }
    }
}
