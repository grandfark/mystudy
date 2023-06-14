package ex05.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		System.out.println("sort 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		
		

		Arrays.sort(a);// 정렬 알고리즘이 이미 내부적으로 처리되어 있는 메소드 오름차순으로 되어있다. 내림차순은 출력 변경
//		System.out.println(a);//모든 변수 데이터는 메모리에 할당되어 쓰이는데 그 위치값이 출력된 것
		
		
		System.out.println("\n\n 오름차순 sort 후 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
 
		System.out.println("\n\n 내림차순 sort 후 출력 : ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
		}
	}
}
