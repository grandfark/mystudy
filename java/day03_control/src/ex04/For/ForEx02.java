package ex04.For;

public class ForEx02 {
	public static void main(String[] args) {
		
		int a =1, b =1;
		
//		for (a =1; a<4; ) {//초기값, 증감식 생략가능(단,조건식을 생략하면 무한루프가 된다.
//			System.out.println(a);
//			a++;
//		}
		
//		for (; ; ) {
//			System.out.println(a);
//			a++;
//			
//			if(a ==7) break; // 무한루프 종료법, 탈출구문 사용
//		}

		for (a=1, b=5; a < 11; a++, b=+2 ) {//초기값, 증감식 2개이상 가능하다. 단, 조건은 오직 1개 이다.
			System.out.println(a);
			System.out.println("b:"+b);
			
		}
		
	}
}
