package ex03.exception;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("x = , y =");
		int x = 0, y, result;

		try { 
			System.out.println("x , y = ");

			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result  = x / y;
			System.out.println(result);
			
			
			result = x / y;
		} catch (ArithmeticException e) {
			System.out.println(x);
			e.printStackTrace();
		}


	}

}
