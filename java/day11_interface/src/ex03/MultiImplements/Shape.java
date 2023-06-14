package ex03.MultiImplements;

import ex02.Interface.IDraw;

public class Shape implements IDraw, Test {

	public void view() {
		System.out.println("이미 덕지덕지 붙었다");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	public double calc(double x) {
		return x;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testView() {
		// TODO Auto-generated method stub
		
	}

	public void show(String name) {
		// TODO Auto-generated method stub
		
	}

}
