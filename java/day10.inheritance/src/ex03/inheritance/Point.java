package ex03.inheritance;

public class Point {
	protected int x, y;
	
	public Point(int x, int y) {//생성자 함수
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point: x, y constructor");
	}
	
	public Point() {
		x = y = 10;
		System.out.println("default constructor");
	}
	
	public void disp() {
		System.out.print(x+", "+y);
	}
	
	
	public Point(int x) {
		this(x, 9 );
		System.out.println("x constructor");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}



/*
 * class Circle extends Point{
 	}
 */
