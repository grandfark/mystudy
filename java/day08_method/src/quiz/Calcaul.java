package quiz;

import java.util.Scanner;

public class Calcaul {
	
	//plus ( + ) sub ( - ) 리턴 타입 없이 
	//mul( * ) div ( / ) 리턴타입 존재, 함수는 예외처리
	public static void main(String[] args) {
		System.out.println("덧셈할 더할 두 값을 입력하시오");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		System.out.print("plus = ");
		plus(a, b);
		System.out.println("\n곱셈할 두 값을 입력하시오");
		int q = new Scanner(System.in).nextInt();
		int w = new Scanner(System.in).nextInt();
		System.out.print("mul= ");
		mul(q,w);
		System.out.println("\n뺄셈할 두 값을 입력하시오");
		int p = new Scanner(System.in).nextInt();
		int o = new Scanner(System.in).nextInt();
		System.out.println("sub= ");
		System.out.println(sub(p,o));
		System.out.println("\n나눗셈할 두 값을 입력하시오");
		int d = new Scanner(System.in).nextInt();
		int f = new Scanner(System.in).nextInt();
		System.out.println("div = ");
		div(d,f);
		System.out.println(div(d,f));
		
		
	}
	public static void plus(int a, int b) {
		int plus = a + b;
		System.out.print(plus);
	}
	
	public static void mul(int q, int w) {
		int mul = q * w;
		System.out.println(mul);
	}
	public static int sub(int p, int o) {
		int sub = p - o;
		return sub;
	}
	
	public static int div(int d, int f) { //정의부
		int div = 0;
		try {
			div = d/ f;
			
		}catch(Exception e){
			System.out.println("출력할 수 없습니다.");	
			System.out.println("계산을 종료합니다.");
		}
		return div;
	}

}
