package ex02.scanner;

import java.util.Scanner;

public class ScannerText {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);//객체생성, 메모리 할당, 생성자함수자동호출
			//next() vs nextLIne()
			System.out.println("string input : ");
			String s1 = sc.next(); //공백 인식 불가
			
			String s2 = sc.nextLine();
			
			System.out.println(s1);
			
			System.out.println(s2);
			
			System.out.println("===============");
			System.out.println("integer, double, date input : ");
			
			int num = sc.nextInt();
			double su = sc.nextDouble();
			System.out.println(num + "," + su);
			System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	
	
	
	}

}
