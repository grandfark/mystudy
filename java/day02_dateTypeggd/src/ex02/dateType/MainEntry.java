package ex02.dateType;

public class MainEntry {
	
	static int Num; // 정수형 데이터 0, 실수형 0.0, 문자열: 내부적 NULL
	static String str; //
	
	public static void main(String[] args) {
		
		int y = 99;//지역변수는 반드시 초기화 하고 사용한다.
		System.out.println(y);
		
		System.out.println("static value : "+Num + ","+str);
		int su = 30;
		System.out.println(su); 	// 4byte
		System.out.println(100); 	// int 로 인식한다 4byte
 		
		long num = 20;
		System.out.println(num); 	//8byte
		System.out.println(1000L); 	//접미에 L을 씀으로써 int -> long
		
		double d = 12.34;
		System.out.println(d);
		System.out.println(34.56);
		System.out.println(12.34f);
		
		float f = 12.34f;			//대입 연산자로 float f 는 지정불가
		System.out.println(f);
	} //main end
} //class end
