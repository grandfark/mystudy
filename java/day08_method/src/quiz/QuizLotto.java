package quiz;

import java.util.Arrays;
import java.util.Random;

public class QuizLotto {

	public static void init() {

		int[] arr = new int[6]; // 배열의 길이 설정

		Random rand = new Random();// 난수 생성

		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = rand.nextInt(45) + 1;// 1 ~ 45 까지 난수 생성
			
			if (ischeck(arr, i)) {
				
				i--; //
				
			}//if end
		} // for end
		Arrays.sort(arr);
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}//for end

	}//init end

	public static void main(String[] args) {
		init();//호출
		for(int i = 1; i < 6; i++) {
			
		}
	}

	public static boolean ischeck(int[] arr, int i) {

		boolean flag = false;
		for (int j = 0; j < i; j++) {
			if (arr[i] == arr[j]) {
				flag = true;
			}
		}

		return flag;
	}
}
//ischeck(int[] arr ,int i){}
