package ex02.array;

import java.util.Scanner;

public class QuizEx2 {
	public static void main(String[] args) {
	 
		int su = 3, sum =0 ;
		double avg  = 0; 
		double []arr = new double [su];
		
//		for(int i =0; i <sus; i++) {
		for(int i =0; i <arr.length; i++) {
			System.out.println("일 강수량 입력");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg= (double)sum /arr.length;
		}
		System.out.printf("4월 강수량 평균 = %2f",avg);
	}	
}
//switch 를 이용하여 원하는 달을 입력 받아서 일수를 결정한다.


//문제] 기상청에 출근했다.(단, 특정월 (4월) 30일 기준) 비가 온날에 대하여 
//비가 온날에 대한 강수량 평균을 구하는 프로그램
//(단, 강수량 평균은 소수점 2자리까지 출력) double로 출력한다.