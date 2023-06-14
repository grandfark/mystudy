package ex03.inheritance;

public class Circle extends Point {// sub class//Point 상속
	private int r;//확장
	private Point pt;
	
	public Circle() {
		this.r = 5;
		System.out.println("Circle default Constructor");
	}

	public Circle(int x, int y) {
		super(x, y);
		this.r = 55;
	}

	public void disp() {
		super.disp();
		System.out.println(", " + r);// Point 를 degfault에서 protected 로 바꿔도 유지된다.

	}
}
