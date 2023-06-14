package ex06.constructor;

public class MainEntry {
	public static void main(String[] args) {
		/*
		Point pt1 = new Point();
		pt1.display();
		
		Point pt2 = new Point(4);
		pt2.display();
		
		Point pt3 = new Point(5,5);
		pt3.display();
		*/
		
		Point pt = new Point();
		pt.disp();
		System.out.println(pt.hashCode());
		
		Point pt2 = new Point(5,50);
		pt2.disp();
		System.out.println(pt2.toString().hashCode());
		
		Point pt3 = new Point(88);
		pt3.disp();
		System.out.println("할당된 메모리 주소 : "+pt3.hashCode());
	}
}
