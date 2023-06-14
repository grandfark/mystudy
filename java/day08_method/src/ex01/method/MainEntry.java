package ex01.method;

import java.util.Scanner;

public class MainEntry {

	public static void plus(int x, int y, String msg) {//함수 정의부 (구현부)
		System.out.println("hap = " + (x + y));
		int sum = x + y;
		System.out.println(sum);
		System.out.println(msg);
		System.out.println(x + ", " + y + ", " + msg);
	}

	private static void abs(int i) {//해당 클래스 내부에서만 사용한다. 이경우 MainEntry 가 된다.
									//public 로 바꾸면 다른 클래스에서도 사용 가능
		if( i < 0 ) i = -i; 
		System.out.println("절대값 : "+i);
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		abs(-9);
		
		plus(10, 20, "Hello World");//함수 호출
		
		
		System.out.println("main start");
		line();
		info();// 스테틱메소드라는걸 알아야한다. 볼드체로 적용된다.
		line();
		System.out.println("main end");
		line();
		System.out.println();
//		Scanner sc = new SCanner(System.in);
	}



	//1) 매개변수 없고, 리턴타입이 없는 경우
	public static void info() {
		System.out.println("호");
		System.out.println("출");
		System.out.println("안됨");
		// main에서 호출하면 호출됨
	}

	public static void line() {// line 메소드 생성
		System.out.println("======================");
	}
//2) 매개변수 있고, 리턴타입 없는 경우
}
