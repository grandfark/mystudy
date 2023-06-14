package quiz;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요. 5번의 기회가 주어집니다.");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();//유저 입력값

		int cor = (int) (Math.random() * 100 )+ 1;//컴퓨터 생성 난수
		
		int coin = 0;//게임 회수
		while ( coin++ < 6 && coin > 0) {
			coin--;
			
			if (u < cor && coin > 0) {
				System.out.println("up");
				System.out.println("틀렸습니다.");
				System.out.println(coin + " 회 남았습니다.");
			} else if (u > cor && coin > 0) {
				System.out.println("down");
				System.out.println("틀렸습니다.");
			}else if (u > cor && coin > 0) {
				System.out.println("전부 틀렸습니다.");
				System.out.println("컴퓨터의 값 : "+cor+" 입력한 값 : "+u);
			}else System.out.println("맞았습니다."); // else (if) 종료
		}//while 종료
		System.out.println(coin + " 회 남았습니다.");
	}
}
//UpDownGame 0~100 사이의 난수중 ok
//dan = 난수값 