package ex01.lambda;

import java.util.ArrayList;

public class asgasg {
	public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(5);
	numbers.add(9);
	numbers.add(8);
	numbers.add(1);
	
//	System.out.println(numbers);//[5, 9, 8, 1]
	
//	numbers.forEach( (n) -> { System.out.println(n); } );
	numbers.forEach( n -> { System.out.println(n); } );
	
//		for(int item: numbers){//5
//			System.out.println(item);//9
//		}//8
	}//1
}