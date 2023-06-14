package quiz;

import java.util.Scanner;

public class YearTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("년을 입력하세요.");
//	
//	int year = sc.nextInt();
//	
//
//	if( year % 4 == 0) {
//		System.out.println("윤년입니다.");
//	}
//	else if(year % 100 != 0 || year %400 ==0) {
//		System.out.println("평년입니다.");}
//	1.변수선언
	int year;
	String mgs = "";
	boolean flag = false;
	
//	2.메시지 출력하기
	System.out.print("year = ");
	year = new Scanner(System.in).nextInt();
//	3.처리 계산
	if((year % 4 ==0) && (year %100 !=0 || year %400  ==0)) {
		flag = true;
	}
	mgs = (flag = true) ? "윤년":"평년";
//	4.결과출력
	System.out.println(year+" 년도==> "+mgs);
	}
}