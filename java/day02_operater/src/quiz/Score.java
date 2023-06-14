
package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요(국어, 영어, 전산순)");
		
		int ko = sc.nextInt();
		int en = sc.nextInt();
		int el = sc.nextInt();
		
		int all = ko + en + el;
		double aver = (ko + en + el)/3;
		System.out.println("국어 : "+ko+"\n영어 : "+en+ "\n전산 : "+el+"\n총점 : "+all+ "\n평균 : " +aver);

	}

}
//문제] 이름을 입력받고, 국어, 영어, 전산 점수를 입력받아서 총점, 평균까지 구하는 프로그램 작성
// ???님의 성적표******
// 국어 : xxx, 영어 : xxx, 전산 : xxx;	
// 총점 : xxx, 평균 : xxx;