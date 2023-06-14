package quiz;

import java.util.Scanner;
public class Quiz_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자A = "); int A = new Scanner(System.in).nextInt();		
		System.out.print("숫자B = "); int B = new Scanner(System.in).nextInt();
		System.out.print("기호 :"); 
		
		
		String plus = sc.next(); 
		
		char op = plus.charAt(0);//입력 받은 기호의 값은 +0 -0 *0 /0 이런식으로 되어있다. 0은 보이지 않음 charAt함수는 뒤에 0을 제거하는 함수
		
		if(op == '+') {//기호 뒤의 0을 제거한다.
			System.out.println("계산한 결과 :" + A+B);
		}else if(op == '-') {
			System.out.println("계산한 결과 :" + (A-B));
		}else if(op == '*') {
			System.out.println("계산한 결과 :" + A*B);
		}else if(op == '/') { 
			System.out.println("계산한 결과 :" + A/B); 
		}
		
	
		
	}
}













//public class Quiz_Max {
//	public static void main(String[] args) {
//		System.out.println("서로 다른 정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자A = "); int A = new Scanner(System.in).nextInt();		
//		System.out.println("숫자B = "); int B = new Scanner(System.in).nextInt();
//		System.out.println("숫자C = "); int C = new Scanner(System.in).nextInt();
//
//		if( A > B && B > C) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ A +", "+ B + ", "+ C +"입니다.");
//		}else if( A > B && B < C && A > C) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ A +", "+ C + ", "+ B +"입니다.");
//		}
//		else if(A < B && B > C && A > C) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ B +", "+ A + ", "+ C +"입니다.");
//		}else if(A < B && B > C && A < C) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ B +", "+ C +", "+ A +"입니다.");
//		}else if(A < B && B < C ) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ C +", "+ B +", "+ A +"입니다.");
//		}else if(A > B && B < C && A < C) {
//			System.out.println("세 수 "+A+", "+B+", "+C+" 중 큰 순서로 나열한 결과는 "+ C +", "+ A +", "+ B +"입니다.");
//		}else if(A == B && A < C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+C+", "+A);
//		}else if(A == B && A > C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+A+", "+C);
//		}else if(B == C && A < C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+C+", "+A);
//		}else if(B == C && A > C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+A+", "+C);
//		}else if(C == A && B < C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+C+", "+B);
//		}else if(C == A && B > C) {
//			System.out.println("값이 동일한 수가 있습니다. 중복된 수는 생략하여 비교합니다. \n"+B+", "+C);
//		}
//		else {
//			System.out.println("세 수의 값이 동일합니다.");
//		}
//	}
//}
//숫자 3개를 입력하였을때 큰 순서대로 출력하기








//public class Quiz_Max {
//	public static void main(String[] args) {
//		System.out.println("정수를 입력하세요.");
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자A = "); int A = new Scanner(System.in).nextInt();		
//		System.out.println("숫자B = "); int B = new Scanner(System.in).nextInt();
//
//		if( A > B) {
//			System.out.println("두 수 "+A+", "+B+" 중 더 큰 숫자는 "+ A +" 입니다.");
//		}else if(A == B) {
//			System.out.println("두 수의 크기는 동일 합니다.");
//		}else { 
//			System.out.println("두 수 "+A+", "+B+" 중 더 큰 숫자는 "+ B +" 입니다.");
//		}
//		 
//	}
//}
//문제] 정수 2개를 입력 받아서 큰수를 출력하는 프로그램 작성