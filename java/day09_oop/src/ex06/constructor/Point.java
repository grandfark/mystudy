package ex06.constructor;

public class Point {
	private int x, y;//멤버 변수
	
	/*
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
		
	
	public Point() {
		this.x = 0;
		this.y = 1;
	}
		
	public Point(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	*/
	//생성자함수(최소3개)
	public Point() {
		this(100,100);
		System.out.println("default constructor");
//		x = y = 100;this(100,100)과 동일한 값
	}
	
	
	public Point(int x, int y) {
		
		System.out.println("2 constructor");
		this.x = x;
		this.y = y;
	}


	public Point(int x) {
		this(x,555);
		System.out.println("1 constructor");
//		this.x = x;
//		y = 156234;
	}


	//getter/setter
	

	//output method
	/*
	public void display() {
		System.out.println("x : "+x +", y: "+y);
	}
	 */
	public void disp() {
		System.out.println("x = "+x+ ", y = " +y );
	}

}
