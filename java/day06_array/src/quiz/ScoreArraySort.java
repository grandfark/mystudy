package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArraySort {

	public static void main(String[] args) {
		int INWON = 7;
		Scanner sc = new Scanner(System.in);

		int[] num = new int[INWON];//학생번호
		int[] kor = new int[INWON];//국어점수
		int[] eng = new int[INWON];//영어점수
		int[] math = new int[INWON];//수학점수
		int[] total = new int[INWON];//총점
		double[] avg = new double[INWON];//평균
		String[] name = new String[INWON];//이름
		char[]grade = new char[INWON];//학점
		double avgall = 0.0;
		int totalall = 0;

		int[] rank= new int[INWON];

		for (int i = 0; i < INWON; i++) {
			System.out.print("이름 입력:");
			name[i] = sc.next();
			System.out.print("국어 점수 입력:");
			kor[i] =  sc.nextInt();
			System.out.print("영어 점수 입력:");
			eng[i] =  sc.nextInt();
			System.out.print("수학 점수 입력:");
			math[i] =  sc.nextInt();		

			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = (total[i] / 3.0);
			totalall += total[i];
			avgall = (double) totalall / INWON;
			
			switch (((int) avg[i]) / 10) {
			case 10:
			case 9:
				grade[i] = 'A'; break;
			case 8:
				grade[i] = 'B'; break;
			case 7:
				grade[i] = 'C'; break;
			case 6:
				grade[i] = 'D'; break;
			default:
				grade[i] = 'F'; break;
			}
			System.out.println("*****"+name[i]+" 님의 성적표 ****");
			System.out.print("국어 : "+ kor[i]);
			System.out.print("\t영어 : "+ eng[i]);
			System.out.print("\t수학 : "+ math[i]);
			System.out.println();
			
			System.out.print("총점 : "+total[i]);
			System.out.print("\t평균 : "+avg[i]);
			System.out.println("\t학점 : "+grade[i]);

			System.out.print("이름 : " + name[i]);
			System.out.println("\n=====================");
			
			
	
		}
		System.out.println("7명 모두 입력하였습니다.");
		int arr[]= new int[INWON];//정렬되지 않은 배열
		for(int i = 0; i < total.length; i++) {
			arr[i] = total[i];
		}
		Arrays.sort(arr);//정렬된 배열
		for(int i =0; i< arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == total[i]) {
					rank[i] = arr.length-j;
					
				}
			}
		}
	
		System.out.println("평균을 기준으로 순위를 출력합니다.");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(name[i]+ " 학생 : " + rank[i] + "등");
		}
		
		

	}

}
