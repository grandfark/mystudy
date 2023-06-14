package quiz;

import java.util.Scanner;

public class ege {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("배열의 길이 : " + a.length);
			a[i] = sc.nextInt();
			System.out.println("배열 내용 : "+a[i]);
		}
	}

}
