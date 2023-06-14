package ex05.While;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1; //변수 초기화
//		while (a < 11 ) {//조건
//			System.out.println(a);
//			a++; //증감식
//		}
		a=0;
		while(a++ < 10){ //조건
			System.out.println(a);
		}
	}
}
