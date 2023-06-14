package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		//객체 생성해서 3,5 로 결과 출력하기
		Point p = new Point();
		p.display();//초기값
		
		p.setX(100);
		p.setY(25);
		p.display();
		
		p.setXY(3, 5);
		p.display();
		
		System.out.println("++++++++++++++++++++++++");
		
		Rectangle rec  = new Rectangle();
		rec.displayRec();
		rec.SetX1(1);
		rec.SetX2(2);
		rec.SetY1(3);
		rec.SetY2(4);
		
		
		rec.displayRec();
	}
}
