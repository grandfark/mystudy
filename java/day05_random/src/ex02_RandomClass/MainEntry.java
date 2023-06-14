package ex02_RandomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextDouble());
		
		int num = rand.nextInt();
		
		System.out.println(num);
		
		System.out.println("- - - 절취선 - - -");
		
		System.out.println(rand.nextInt(10));//10을 곱한 상태 정수로 출력한다.(0~10)
		
		System.out.println(rand.nextInt(10)+1);
		
		for ( int i = 1; i < 101 ; i++) {
			if( i %2==0)  continue;
				System.out.print(i+" \t");
			
		}
	}
}
