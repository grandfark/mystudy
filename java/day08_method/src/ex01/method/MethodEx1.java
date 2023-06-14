package ex01.method;

import java.util.Scanner;

public class MethodEx1 {

	// 3) 매개변수 없고, 리턴타입 있는 경우

	public static int show() {
//		System.out.println("show() method");
		return 100;
	}

	// 만들 max 함수 큰수 출력
	public static int max() {
		System.out.println("a , b ="); //ab 값 입력
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

//		if max = ( a < b )? a: b;
		if (a > b) return a; else return b;
		// 리턴타입 메서드는 리턴 잊지 말것
	}

	public static void main(String[] args) {
		System.out.println("max = " + max());
		show(); // 함수호출 100
		System.out.println(show());
		int num = show(); // show 를 가져온다.
		System.out.println(num);
		int show = show(); // 변수와 호출이름이 같아도 된다. 블럭 내부에서만 사용해서 동일이름 사용가능
		System.out.println(show);
	}
}
