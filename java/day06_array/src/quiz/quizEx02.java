package quiz;

import java.util.Scanner;

public class quizEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [3];
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt(); //배열의 길이가 늘어날수록 늘어난다.
		}
	}
}
