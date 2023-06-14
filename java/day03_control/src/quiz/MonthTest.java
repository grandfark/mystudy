package quiz;

import java.util.Scanner;

public class MonthTest {
	public static void main(String[] args) {
		
		System.out.println("input month : ");
		Scanner sc= new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
	
		String mgs = "";
		boolean flag = false;
		
		switch(month) {
		case 1:	case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(month + " 월의 마지막 날은 31일 입니다."); break;
		
		case 4:case 6:case 9:case 11:
			System.out.println(month+ " 월의 마지막 날은 30일 입니다."); break;
		
		case 2: 
			System.out.println("input year : " );
			year = new Scanner(System.in).nextInt();
			
			if((year % 4 ==0) && (year %100 !=0 || year %400  ==0)) {
				flag = true;
			}
			mgs = (flag == true) ? year + "년도 " + month+" 월의 마지막 날은 29일 입니다." : year +"년도"+month+" 월의 마지막 날은 28일 입니다."; 
			
			
			System.out.println(mgs); 
			
			break;
			
			default:
				System.out.println("잘못된 값이 입력되었습니다. 월 수는 1~12 사이의 숫자를 입력해 주세요");
		}
	}
}
//문제 월의 마지막 일수 를 출력하는 프로그램