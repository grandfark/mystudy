package ex03.oop;

public class Point {
	private int x, y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	//getter / setter method
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//output
	
	public void display() {
		System.out.println(x + " , " + y);
	}
}
