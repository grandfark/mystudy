//*/
package ex03.operator;

import java.util.Scanner;

//최대산쉬관논삼대콤
public class MainEntry {	
	public static void main(String[] args) {
		//삼항(조건)연산자 : (조건)? 참 : 거짓;
		
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 input = ");
		
		x = sc.nextInt(); y = sc.nextInt();
		
//		if(x > y)		result = x;
//		else result = y;
		
		result = (x > y) ? x : y;
		System.out.println("max = "+ result);
		
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();

		//if판정
		
		str = (year == 2000) ? "맞네" : "틀리네";
		System.out.println(year + "년도 : " + str);
	}
}
//*/


/*
package ex03.operator;

import java.util.Scanner;

//최대산쉬관논삼대콤
public class MainEntry {	
	public static void main(String[] args) {
		//삼항(조건)연산자 : (조건)? 참 : 거짓;
		
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data 2 input = ");
		
		x = sc.nextInt(); y = sc.nextInt();
		
//		if(x > y)		result = x;
//		else result = y;
		
		result = (x > y) ? x : y;
		System.out.println("max = "+ result);
		
		String str = null;
		System.out.println("year = ");
		int year = sc.nextInt();

		//if판정
		
		str = (year == 2000) ? "맞네" : "틀리네";
		System.out.println(year + "년도 : " + str);
	}
}
*/


/*
package ex03.operator;

//최대산쉬관논삼대콤
public class MainEntry {	
	public static void main(String[] args) {
		//논리연산자 : &, &&(10), |, ||(10), ^(2,xor) , !(10, not)
		//2진법
		System.out.println(4 & 7);
		System.out.println(4 | 7);
		System.out.println(4 ^ 7);	
		//10진법
		int x = 10, y = 20, z= 30;
		boolean flag = false;
//		flag = (x < y) && (y < z);
		flag = (x < y) && (y > z); //'&&'연산일때 앞에 값이 거짓이면 뒤는 수행하지 않는다.
		System.out.println(flag);
		
		flag = (x < y) || (y < z);//'||'연산일때 앞값이 참이면 뒤는 수행하지 않는다.
//		flag = (x > y) || (y < z);
		System.out.println(flag);
		
		System.out.println(!flag);
	}
}
*/