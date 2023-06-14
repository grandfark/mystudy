package ex01_generic;

import java.util.Date;

class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<>();
		String [] str = {"abc","kbs","dirotor"};
		t1.set(str);
		t1.print();
		System.out.println("****************");
		
		
		GenericEx<Integer> t2 = new GenericEx<>();
		Integer [] num = {1,23,456,7898};
		t2.set(num);
		t2.print();
		System.out.println("****************");
		
		GenericEx<Double> t3 = new GenericEx<>();
		Double [] dou = {0.1,2.3,4.56,78.98};
		t3.set(dou);
		t3.print();
		System.out.println("****************");
		
		GenericEx<Object> t4 = new GenericEx<>();
		Object [] obj = {"number: ",1,23,456,789.8,new Date(),"asd456", new Point()};
		t4.set(obj);
		t4.print();
		System.out.println("****************");
	}
}
