package ex04.array;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		// next(공백인식 못함) vs nextLine(공백인식 잘함)

		Scanner sc = new Scanner(System.in);
		String a = sc.next();	//바로 스택에 저장되는게 아니라 현재는 heap 영역에 저장된 상태
		sc.next(); sc.next();	//공백처리: 자바에서는 2바이트로 처리하기 때문에 한번 더 써줘야 한다.
		String b = sc.next();

		System.out.println( a  + ", " + b);

		
//		String name = sc.nextLine(); //공백 인식 가능
//		String str = sc.next();// 공백 인식 불가
//		
//		System.out.println(name+", ");
		
	}
}
