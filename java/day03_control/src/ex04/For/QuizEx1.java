package ex04.For;

//public class QuizEx1 {
//	public static void main(String[] args) {
//		//문제1] 1~100 까지 중에서 합을 구하는 프로그램 작성하기
//		
//		int sum = 0;//누적합을 위한 변수 선언
//1		for(int i = 1; i<=100; i++) {
//			//sum = sum+i; 
//2			sum += i;
//		}		
//3		System.out.print("i의 총합:"+sum);
//	}//3항 치환같은거 필요없다.
//}
public class QuizEx1 {
	public static void main(String[] args) {
		// 문제2] 1~ 100까지 3의 배수의 합과 개수를 구하는 프로그램 작성
		int a = 0;
		int b = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				a += i;
				b++;//3의배수로 고정된 채로 늘어나서 a 처럼 i를 대입하지 않는다
			}
		}
		System.out.println(b);
	}
}