package quiz;

import java.util.Scanner;

public class Calcaul2 {
	
	//plus ( + ) sub ( - ) 리턴 타입 없이 
	//mul( * ) div ( / ) 리턴타입 존재, 함수는 예외처리
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		try {//나눗셈
			int a = sc.nextInt();
			int b = sc.nextInt();
			}catch(Exception e){
//			plus();
//			mul();
			
		}

		
		
	}
	public static void plus(int a, int b) {
		int plus = a + b;
		System.out.print(plus);
	}
	
	public static void mul(int a, int b) {
		int mul = a * b;
		System.out.println(mul);
	}
	public static int sub(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
		return sub;
	}
	
	public static int div(int q, int w) {
		int div = q / w;
		System.out.println(div);
		try {
			
			}catch(Exception e){
			System.out.println("나눌 값으로 0은 사용 할 수 없습니다");
//			System.eixt(0);
		}
		return div;
		
	}
}
