package ex01.memory;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
			
		int x =3, y =5;
		double d = 12.34;
		char ch = 'A';
		
		String s1 = new String("Kosa");//Heap가 700 이란 주소값을 가진다.
		String s2 = new String ("daeb0");
		System.out.println("int date input : ");
		Scanner sc = new Scanner(System.in);
		
		int  z = sc. nextInt();
		System.out.println(z);
		System.out.println(x+", "+y+", "+d+", "+ch);
	}

}
