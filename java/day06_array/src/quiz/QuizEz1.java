package quiz;

import java.util.Scanner;

public class QuizEz1 {
	public static void main(String[] args) {
		
	int[] arra = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 };
	
	for (int i =0 ; i < arra.length; i++) {
		if( i %2 ==0) continue;
		System.out.print("arra["+i+"] = "+arra[i]+"\n");
	}
	
	
	////////////////확장 for 문 ///////////////////////
//		int loop = 3;
//		for (int item : arra) {
////			if (loop == item) break; //8미출력
//			
//			System.out.println(item);
//			
//			if (loop == item) break; //8출력
//		}

		// 배열 여러개 데이터 중에서 7의 개수 찾기
//		int [] arr = new int[] {7,3,7,8,1,9,7,100,12,7,33,7};
		// seek 변수를 생성하고 배열의 내용과 비교해서 같은지 확인한다.

//		for (int i = 0 ; i < arr.length; i++) {
//		for (int i = arr.length-1; i>=0; i++) {
//			System.out.print(arr[i]+"\t");
//			System.out.print("arr["+i+"] = "+arr[i]+"\n");
//		}
		// 2.홀수 인덱스 위치 데이터만 출력

//public class QuizEz1 {
//	public static void main(String[] args) {
		// 배열 5개 데이터 선언 하고 배열의 합을 구하라.
//		int [] b = new int[] {3,5,8,1,9};
//		int all = b[0]+b[1]+b[2]+b[3]+b[4];
//	System.out.println("단순 총합: "+all);
//
//
//	int sum = 0 ;
//	for(int i =0; i < a.length; i++) {
//		sum += b[i];
//	}//for end 
//	System.out.println("총합: " +sum);
//	

//난수를 7개 생성하고 임의의 수의 갯수를 구하라
//		int a[] = new int[7] ; 
		//임의의 값을 입력한다.
//		Scanner sc = new Scanner(System.in);
//		int seek; 
//		int count=0; 
//		System.out.println("임의의 수를 입력하시오");
//		 //난수 생성
//		for(int i = 0; i < 7; i++ ) {
//			a[i] = (int)(Math.random()*10+1);
//			System.out.println("a[i]:"+a[i]);
//		}
//		seek = (int)(Math.random()*10+1);//찾을값 생성
//		for(int i = 0 ; i< a.length ;i++) {
//			if(a[i] == seek) {
//				count++;
//			}
//		}
//		System.out.println("seek의 값 출력: "+count);
//		System.out.println("출력: seek"+ seek);
//		if(a[i] == seek) {
////			System.out.println("갯수 출력:"+seek);
//	}
}
}
