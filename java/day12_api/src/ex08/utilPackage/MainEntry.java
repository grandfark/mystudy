package ex08.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();// 시스템이 가진 날짜를 가져옴

		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print(c.get(Calendar.MONTH) + 1 + "월 ");// 월은 0 부터 시작한다.
		System.out.print(c.get(Calendar.DATE) + "일 ");

		Date date = new Date();
		int h = date.getHours();// deplicate 처리 되어 줄이 쳐진다. 하지만 구현 가능하다
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재시간 " + h + " : " + m + " : " + s);

		System.out.println();
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c2.set(2018, 12, 20, 0, 0);

		if (c1.after(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일 이후입니다.");
		} else if (c1.before(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일 이전입니다.");
		}
		if (c1.equals(c2)) {
			System.out.println("현재 시간은 2018년 1월 1일입니다.");
		}

		
		
		
		
		
		System.out.println("\n모든정보 출력");
		System.out.println(c);
	}
}
