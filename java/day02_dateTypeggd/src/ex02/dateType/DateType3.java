package ex02.dateType;

public class DateType3 {
	//진법 - 
	public static void main(String[] args) {
		int su = 10;
		
		System.out.println("10진수 : " + su);// %d, %o, %x, %X 
		
		System.out.printf("10진수 %d\n", su);
		
		System.out.printf("8진수 %o\n", su);
		
		System.out.printf("16진수 %x %X \n", su, su);
		
		System.out.printf("%d %x %o @x \n", su ,su, 10, 10);
		
		//0숫자 --> 8진수, 0x숫자 --> 16진수
		System.out.printf("%d\n", 012);// 012(8진수) --> 10진수 출력
		
		System.out.printf("%d\n", 0xA); //0xA(16진수) 출력
		System.out.println("--------------------------");
		
		double f =12.34;
		System.out.println(f);
		float ff = 5.6f;
		System.out.println(ff);
	}

}
/*
	10진수 : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 ...
	0 ~ 9
	8진수 : 0 1 2 3 4 5 6 7
	0 ~ 7
	16진수 : 0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c
	0 ~ 9 , a , b, c ,d ,e, f
*/
