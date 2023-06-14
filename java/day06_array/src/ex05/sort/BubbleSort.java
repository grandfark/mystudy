package ex05.sort;

public class BubbleSort {
	public static void main(String[] args) {

		int[] a = { 7, 3, 5, 2, 8 };
		int temp;
		System.out.println("sort 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

		// sort
		for (int i = 0; i < a.length; i++) { // 4

			for (int j = 0; j < a.length - i - 1; j++) {// 4-i-1 비교가 끝난 i 만큼 제외힌다.
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				} // if end
			} // j end
		} // i end

		System.out.println("\n\n sort 후 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
/*
 * 가장 큰 수가 앞에 온다.
 * 
 */