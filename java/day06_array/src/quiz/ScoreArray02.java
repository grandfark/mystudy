package quiz;

import java.util.Scanner;

public class ScoreArray02 {
	public static void main(String[] args) {
		int SU=4, NO =3;
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int [NO][SU];
		String []name = new String[NO];
		double [][]avg  =  new double[NO][SU];
		char [] grade = new char[SU];
		
		for(int i = 0; i <arr.length; i++) {
			System.out.printf("%d번째 학생이름 : ", i+1);
			 name[i] = sc.next();
			 for(int  j =0 ; j < arr[i].length-1; i++){
				 switch (j) {
				 case 0: System.out.println("국어 점수 입력 : ");
				 break;
				 case 1: System.out.println("영어 점수 입력 : ");
				 break;
				 case 2: System.out.println("수학 점수 입력 : ");
				 break;
				 }
			 }
			
			
			
			
		}
	}
}
