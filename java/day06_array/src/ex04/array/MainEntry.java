package ex04.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);s
//		int[]a = new int [30];
//		int[][]a2 = new int[2][3];//초기화가 되어있지 않을때는 행,열크기를 생략할 수 없다.
//		int[][]a3 = new int[][] {{1,2,3},{4,5,6}};
//		int[][]a4 = {{1,2,3},{4,5,6}};
////error int[][]a5 = {1,2,3,4,5,6};
////error int[][]a6 = new int [2][]{{1,2,3},{4,5,6}};
//		int[][]a7  = {{0,},{0,}};
//		
//		int [][][]a8 = new int[1][2][3];//[면],[행],[렬] 순이다.
//		
//		System.out.println("1차원 배열 길이 : "+a.length);//30일걸
//		System.out.println("2차원 배열 행길이 : "+a2.length);
//		System.out.println("2차원 배열 열길이 : "+a2[0].length);
//		System.out.println();
//		System.out.println("3차원 배열 면길이 : "+a8.length);//1
//		System.out.println("3차원 배열 행길이 : "+a8[0].length);//2
//		System.out.println("3차원 배열 열길이 : "+a8[0][0].length);//3
//		//input 
//		for(int i = 0; i < a8.length; i++) {
//			
//			for (int j =0; j <a8[i].length; j++) {
//			
//				for(int k=0; j <a8[i][j].length; k++) {
//					
//					System.out.print(a8[i][j][k]+"\t");
//					
//				}//k end
//				System.out.println();
//			}//j end
//
//		}//i end
//	}
//}
//		
		
		
		
		
		
//		//임의적인 데이터 입력 받아서 배열 데이터 값을 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3차원 배열 aa 에 들어갈 면,행,열의 값을 각각 입력하시오");
		int i =sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
		int[][][] aa = new int[3][2][2];
		System.out.println("배열aa의 면길이: " + aa.length);
		System.out.println("배열aa의 행길이: " + aa[0].length);
		System.out.println("배열aa의 열길이: " + aa[0][0].length);
		for ( i = 0; i < aa.length; i++) {// {q,w,e = 0 0 0}
			for ( j = 0; j < aa[0].length; j++) {
				for ( k = 0; k < aa[0][0].length; k++) {
					aa[i][j][k] = (int) (Math.random() * 10);

//					aa[0][0][k]=sc.nextInt();
					System.out.printf(aa[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

/*
 * int [] arr = new int [100]; for (int i = 0; i <arr.length; i++) { // arr[i] =
 * (i+1); arr[i] = (int)(Math.random()*100+2); }
 * 
 * for (int i = 0; i <arr.length; i++) { arr[i] = i+1;
 * System.out.print(arr[i]+"\t");
 * 
 * if( (i +1 )%10 ==0) System.out.println(); }
 * 
 * } }
 */