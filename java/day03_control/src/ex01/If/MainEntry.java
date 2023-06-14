package ex01.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		System.out.println("integer data input : ");
		String str =""; //nul
		int su = new Scanner(System.in).nextInt();
		
		//홀짝판정
//		if( su % 2 == 0) System.out.println("even");
//		else System.out.println("odd");
		
		if(su % 2 == 0) System.out.println("even");
		else System.out.println("odd");
		
		str = (su %2 == 0 ) ? "even" : "odd";
		System.out.println(str);
		
		if(su > 0 ) System.out.println("양수");
		else if ( su < 0 )System.out.println("음수");
		else System.out.println("0이군요");
		
		
	}
}
