//*
package ex04.For;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
		System.out.println("값을 입력하시오:");
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		for(int n = 1; n<10; n++) {
			System.out.println(i+"*"+ n+"=" +i*n);
		}
	
	}
}


//public class QuizEx2 {
//	public static void main(String[] args) {
//		for (int a = 1; a < 101; a++) {
//			if (a % 2 == 0) {
//				System.out.print(" " + a);
//				if (a % 2 == 0)
//					System.out.println(a + " ");
//				if (a % 20 == 0)
//					System.out.println();
//
//			}
//		}
//	}
//}
//*/
//문제1 1~100까지 중에서 짝수 출력하고 한 화면에 10개 씩 출력하기(열로 출력한다.)