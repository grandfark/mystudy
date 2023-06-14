package quiz;

import java.util.Scanner;

public class scoreDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요.(자연수만 입력이 가능)");
		int su = sc.nextInt();
		if(0 <= su && su <= 100) {
			switch (su/10) {
			case 10: case 9: case 8: case 7:
				System.out.println("상입니다");
				break;
			case 6:
				System.out.println("중");
				break;	

			
			default: System.out.println("하");
				break;
		
			}
		}else {System.out.println("숫자만 입력해주세요.");}
		
	}
}
//if와 switch를 이용하여 
//0-100까지 입력 점수는 예시
//100-70 상
//69-60 중
//59이하 하/노력요망 
//출력