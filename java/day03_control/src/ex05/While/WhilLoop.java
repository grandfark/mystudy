package ex05.While;

import java.util.Scanner;

public class WhilLoop {
	public static void main(String[] args) {
		int su;
		char grade = ' ', ys = ' ';
		Scanner sc = new Scanner(System.in);

		while (true) {// 무한루프

			do {
				System.out.println("당신의 점수 입력 요망: ");
				su = sc.nextInt();
			} while (su < 0 || su < 101);

			System.out.println("\n당신의 점수는 " + su);

			System.out.println("계속 입력하시겠습니까? (y/n) ");

			ys = sc.next().charAt(0);

			if (ys == 'n' || ys == 'n')	break;

		}//end while
	}
}
