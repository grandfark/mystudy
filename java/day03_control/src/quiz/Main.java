package quiz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input Alphabet:");
		char c = sc.next().charAt(0);
		if (65 <= c && c <= 90) {
			c += 32;
		} else if (97 <= c && c <= 122) {
			c -= 32;
		} else {
			System.out.println("알파벳만 입력하세요.");
			System.exit(0);
		}
		
		System.out.println("변환결과: " + c);
	}
}
//대문자 입력시 소문자 출력
//소문자 입력시 대문자 출력