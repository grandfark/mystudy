package quiz;

import java.util.Scanner;

public class ScoreArray01 {

	public static void main(String[] args) {
		int INWON = 3;
		Scanner sc = new Scanner(System.in);

		int[] num = new int[INWON];
		int[] kor = new int[INWON];
		int[] eng = new int[INWON];
		int[] math = new int[INWON];
		int[] total = new int[INWON];
		double[] avg = new double[INWON];
		String[] name = new String[INWON];
		char grade = ' ';// charp[]grade = new char[INWON]
		double avgall = 0.0;
		int totalall = 0;

		for (int i = 0; i < INWON; i++) {
			System.out.print("번호 입력:");
			num[i] = sc.nextInt();
			System.out.print("이름 입력:");
			name[i] = sc.next();
			System.out.print("국어 점수 입력:");
			kor[i] = sc.nextInt();
			System.out.print("영어 점수 입력:");
			eng[i] = sc.nextInt();
			System.out.print("수학 점수 입력:");
			math[i] = sc.nextInt();

			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = (total[i] / 3.0);
			totalall += total[i];
			avgall = (double) totalall / INWON;

			switch (((int) avg[i]) / 10) {
			case 10:
			case 9:
				grade = 'A';
			case 8:
				grade = 'B';
			case 7:
				grade = 'C';
			case 6:
				grade = 'D';
				grade = 'F';
			}

			System.out.println("번호 : " + num[i]);// 나머지는 출력할 문구 작성하면 된다.
			System.out.println("이름 : " + name[i]);

		}

	}

}
