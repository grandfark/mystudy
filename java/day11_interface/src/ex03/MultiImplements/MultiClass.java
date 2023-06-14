package ex03.MultiImplements;

import ex02.Interface.IDraw;

public class MultiClass extends  Shape implements Test, IDraw{

	private int num;
	
	@Override
	public void draw() {//IDraw
		System.out.println("IDraw interface");
	}
	
	@Override
	public double calc(double x) {//Shape
		System.out.println("Shape abstract class");
		return 5.5;
	}
	@Override
	public void show(String name) {//Shape
		System.out.println("Shape abstract class");
	}
	@Override
	public void testView() {
		System.out.println("Test interface");
	}
	
}
