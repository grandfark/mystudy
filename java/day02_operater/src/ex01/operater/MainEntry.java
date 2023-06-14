package ex01.operater;

//최단삼쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		 //산술연산자 : +, -, *, /, %, ^,...
		int x = 10 , y = 20;
		int gob = x * y;
		y = ~x; //비트부정 ~ : -(원래값 + 1) ==> 출력 결과
		//가진 10을 비트로 쪼개고 2진수로 바꾼다.
		
		System.out.println(gob);
		System.out.println("x * y = " +gob);
		System.out.println("x * y = " + (x * y));
		System.out.println("--------------------");
		System.out.println("3+4*5 = " +(3+4-5));
		System.out.println("(3+4)*5 = "+( (3+4)*5));
		//정수 (+,-,*,/,%,^,~) 연산은 정수=정수로 나온다
		System.out.println("\n\n7/3 = " +(7 / 3)); // 몫을 취한다.
		
		//정수 (+,-,*,/,%,^,~) 연산은 정수=정수로 나온다
		System.out.println("\n7 / 3 = " +(7 / 3));	//2
		System.out.println("7 / 3.0 = "+(7/3));		//2.333
		System.out.println("7. / 3.0 = " + (7. / 3.0));
	}
}


/* package ex01.operater;

//최단삼쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
	//단항연산자 : 증감연산자 ==> ++, --, ~ ,
		int x = -6 , y;
		
		y = ~x; //비트부정 : -(원래값 + 1) ==> 출력 결과
		//가진 10을 비트로 쪼개고 2진수로 바꾼다.
		
		System.out.println("x= "+ x + "\ty = " +y);
	}
}
*/
/*
package ex01.operater;

//최단삼쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
	//단항연산자 : 증감연산자 ==> ++, --, ~ ,
		int x = 10 , y;
		
	//	y = x++;	// 후위연산 : 선대입, 후연산
	//	y = ++x;	// 전위연산 : 선연산, 후대입
	//	x = y--; 
		
		x++; //++x;
		y = x; //단독으로 쓰이면 의미가 없다 = 결과가 같다.
		
		System.out.println("x= "+ x + "\ty = " +y);
	}
}
*/