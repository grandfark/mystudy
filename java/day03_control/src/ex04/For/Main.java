package ex04.For;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String star = String.valueOf(n);
		
		star = "*"; //*로 변환

		for (int i = 1; i <= n ; i++) {
			System.out.println(star);
			star = star+"*"; 
		}

	}
}
