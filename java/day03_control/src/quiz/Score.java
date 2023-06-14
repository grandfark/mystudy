
package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		System.out.println("점수를 입력하세요(국어, 영어, 전산순)");
		
		String name = sc.nextLine();
		
		int ko = sc.nextInt();	int en = sc.nextInt();	int el = sc.nextInt();
		
		int all = ko + en + el;
		double aver = (ko + en + el)/3;
	
		
		char grade = ' ';
		switch ((int)aver / 10) {
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F'; break;
		
		}
		System.out.print(name+"님의 성적표***************");
		System.out.printf("\n국어 : "+ko+"\n영어 : "+en+ "\n전산 : "+el+"\n총점 : "+all+ "\n평균 : %.2f" +aver +"\n학점 : %c"+grade);


	}

}
//문제] 이름을 입력받고, 국어, 영어, 전산 점수를 입력받아서 총점, 평균까지 구하는 프로그램 작성
// ???님의 성적표******
// 국어 : xxx, 영어 : xxx, 전산 : xxx;	
// 총점 : xxx, 평균 : xxx; 평점(학점) : A