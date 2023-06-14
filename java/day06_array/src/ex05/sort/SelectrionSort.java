package ex05.sort;

public class SelectrionSort {
	public static void main(String[] args) {
		int [] a = {7, 3, 5, 2, 8};
//		sort(정렬)선택, 버블cc
		int temp;
		
		System.out.println("sort 전 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if (a[i]> a[j]) {
					temp = a[i];
					a[i] = a [j];
					a[j] = temp;
				}//if end
			}// j end
		}// i end
		
		System.out.println("\n\n sort 후 출력 : ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
/*  
 * 기준 존재 
 * 배열의 첫번째를 기준으로 삼는다. (비교대상생성) 
 */
