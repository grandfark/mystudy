package ex03.inheritance;

public class Rect extends Point {
	private int x1, y1, x2, y2;
	
	public Rect(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}		
	
	public Rect() {
		x1 = y1 = x2 = y2 = 10;
		System.out.println("Rect constructor");
	}
	
	public void disp() {
		System.out.print(x1+", "+y1+", " +x2+", "+y2);
	}
	

	//생성자함수 3개
	//getter / setter
	//output method
	
}
