package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FianllyMain {
	public static void main(String[] args) {
		int x = 0, y, result;

		try { 
			System.out.println("x , y = ");

			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result  = x / y;
			System.out.println(result);
			
			
			result = x / y;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");			
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally 무조건 처리됨");
		}


	}	
}
