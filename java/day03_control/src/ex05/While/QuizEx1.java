package ex05.While;

import java.util.Scanner;

public class QuizEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 문자 입력 문구
		int num1;
		int num2;
		char pmmd;

		do {
			System.out.println("첫번째 숫자 입력 요망");
			num1 = sc.nextInt();
		} while (num1 < 0 || num1 > 101);

		do {
			System.out.println("두번째 숫자 입력 요망");
			num2 = sc.nextInt();
		} while (num2 < 0 || num2 > 101);

		do {
			System.out.println("사칙연산 기호 입력 요망 (+, -, *, /)");
			pmmd = sc.next().charAt(0);
		} while ((pmmd != '+') && (pmmd != '-') && (pmmd != '*') && (pmmd != '/'));

		int result = 0;
		if (pmmd == '+') {
			result = num1 + num2;
		} else if (pmmd == '-') {
			result = num1 - num2;
		} else if (pmmd == '*') {
			result = num1 * num2;
		} else if (pmmd == '/') {
			result = num1 / num2;
		}
		
		System.out.printf("결과 값= %d %c %d = %d", num1 , pmmd , num2, result);
		
	}
}
//3과목 입력 받아서 (0~100) 점수만 입력 받는다.
//연산자(+,-,*,/) 하나를 입력 받아서 do while로 받는다. 다른 문자 입력시 재입력 요구
/*
 * 결과 100 100 100*100=10000
 */