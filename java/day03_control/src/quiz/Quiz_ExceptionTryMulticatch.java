package quiz;

import java.util.Scanner;

public class Quiz_ExceptionTryMulticatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x = , y = ");
		int x, y, result;
		x = sc.nextInt();
		y = sc.nextInt();
		try {
	
			result = x/y;
			System.out.println("x / y = "+result);
		}catch(Exception e) {
			System.out.println("다시 입력하십시오.");
			System.out.println("0이 아닌 정수를 입력하십시오.");
			e.printStackTrace();
		}
	}
}

//문제] 정수 2개를 입력 받아서/ 연산처리 프로그램 작성(예외처리 할 것)