package ex04.array;

public class ForeachTest {
	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 100, 98, 99 };
		System.out.println("오름차순 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if (i == 3)
				break;
		}

		// main 이 입력받을 수 있는 3가지: Scanner, io, main method 로 처리방법
//		for(자료형 변수명 : 컬렉션명 또는 배열명) 
		for (int item : a) {
			System.out.print(item + "\t");

		}
		
		System.out.println("\n==============");
		System.out.println("오름차순 출력");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
			
		}
	}
}
