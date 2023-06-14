package quiz;

import java.util.Scanner;

//public class Quiz_switch {
//	public static void main(String[] args) {
//		System.out.println("당신이 받은 점수는 ? (0~100사이의 값을 입력하시오)");
//		int jumsu = new Scanner(System.in).nextInt();
//		
//		
//			switch (jumsu/ 10) {
//			case 10: case 9: grade = 'A'; break;
//			case 8: grade = 'B'; break;
//			case 7: grade = 'C'; break;
//			case 6: grade = 'D'; break;
//			}
//	}
//}
//문제] 이름을 입력받고, 국어, 영어, 전산 점수를 입력받아서 총점, 평균까지 구하는 프로그램 작성
//???님의 성적표******
//국어 : xxx, 영어 : xxx, 전산 : xxx;	
//총점 : xxx, 평균 : xxx; 평점(학점):A

//--------------


public class Quiz_switch {
	public static void main(String[] args) {
		System.out.println("당신이 받은 점수는 ? (0~100사이의 값을 입력하시오)");
		int jumsu = new Scanner(System.in).nextInt();
		char score = ' ';
		char result =' ';
		//평점(학점) 구하는 프로그램 작성
		
		if(89 < jumsu &&  jumsu < 101) {
			score = '1';
		}else if(79 < jumsu && jumsu < 90) {
			score = '2';
		}else if(69 < jumsu && jumsu < 80) {
			score = '3';
		}else if(59 < jumsu && jumsu < 70) {
			score = '4';
		}else score = '5';
		
		switch(score) {
		case '1':	
//			System.out.println("A");
			result='A';
		break;
		
		case '2':	
//			System.out.println("B");
			result='B';
		break;
		
		case '3':	
//			System.out.println("C");
			result='C';
		break;
		
		case '4':	
//			System.out.println("D");
			result='D';
		break;
		
		case '5':	
//			System.out.println("F");
			result='E';
		break;
		
		
		default: System.out.println("잘못 눌렀습니다. 0~100사이의 정수를 선택하세요");
		System.exit(0);	
		}
		System.out.println("당신의 학점은"+result+"입니다.");
	}
}
