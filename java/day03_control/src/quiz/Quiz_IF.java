package quiz;

import java.util.Scanner;

public class Quiz_IF {
	public static void main(String[] args) {
		System.out.println("kor = "); 	int kor = new Scanner(System.in).nextInt();
		System.out.println("eng = "); 	int eng = new Scanner(System.in).nextInt();
		System.out.println("com = "); 	int com = new Scanner(System.in).nextInt();
		double avg = (kor + eng + com)/3.0;
//		double avg = (double)(kor + eng + com) / 3;
	
		if(avg >= 60) {//3과목 평균 60점 이상
			
			if( kor >= 40 && eng >= 40 && com >= 40) {
				System.out.printf("모든과목이 40점 이상이고, 평균이 %.1f로 [합격]입니다.\n",+avg); //소수점 출력
			}else {
				System.out.printf("평균이 %.1f 이지만, "+avg);
				if(kor <= 40)  System.out.print("국어"+kor +" 점");
				if(eng <= 40)  System.out.print("영어"+eng +" 점");
				if(com <= 40)  System.out.print("컴퓨터"+com +" 점");
				System.out.print("으로 [과락탈락] 하셨습니다.");
				}
			
		}else {
			System.out.printf("평균이 %.1f로 평균미달 불합격 입니다\n", avg);
		}
		
	}
}



//package ex01.If;
//
//import java.util.Scanner;
//
//public class Quiz_IF {
//	public static void main(String[] args) {
//		System.out.println("국어, 영어, 컴퓨터 3과목의 점수를 각각 입력하시오");
//		System.out.println("각과목 40점 이상, 평균 60점 이상 합격입니다.");
//		Scanner sc = new Scanner(System.in);
//		
//		int scr1 = sc.nextInt();
//		int scr2 = sc.nextInt();
//		int scr3 = sc.nextInt();
//		
//		if(scr1 < 40) {
//			System.out.println("국어과목 : "+ scr1 +" 점 과락 \n불합격 입니다.");
//		}else if(scr2 < 40){
//			System.out.println("영어과목 : "+ scr2 + " 점 과락 \n불합격 입니다.");
//		}else if(scr3 < 40) {
//			System.out.println("컴퓨터과목 : " +scr3+ " 점 과락 \n불합격입니다.");
//		}else if((scr1+scr2+scr3)/3 >= 60 ) {
//			System.out.println("평균점수 "+(scr1+scr2+scr3)/3+" 점 \n합격입니다.");
//		}else {System.out.println("평균 "+(+scr1+scr2+scr3)/3+" 점 \n불합격 입니다.");}
//		
//		
//	}
//}
//문제] 점수를 입력 받아서 평점(학점) 입력 받아서 평균점수 60점 이상 합격입니다.
//각 과목 40점 이상이면 합격, 평균 불합격, 각 과목 과락여부 













//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하세요."); 
//		
//		int scr = sc.nextInt();
//		
//		if (scr < 101) {
//			grade = "A";
//		}else if(scr < 91){
//			System.out.println("B 입니다");
//		}else if(scr < 81){
//			System.out.println("C 입니다");
//		}else if(scr < 71) {
//			System.out.println("D 입니다.");
//		}else if(scr < 61) {
//			System.out.println("F 입니다.");
//		}
//		
//	}
//}




/*
문제] 점수를 입력 받아서 평점(학점) 구하는 프로그램 작성
범위 100~90:A 89~80:B ... 59~:F

문제] 점수를 입력 받아서 평점(학점) 입력 받아서

*/