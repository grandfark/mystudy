package ex02.Abstract;

public class MainEntry {
	public static void main(String[] args) {
//		1.각자의 클래스로 객체 생성 방식
	
		Circle c = new Circle();
		c.show("원");
		Rect rt = new Rect ();
		rt.show("사각형");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		System.out.println("*********************************************");
		
//		2.부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle");
		sh =  new Triangle();
		sh.show("Triangle");
		sh = new Rect();
		sh.show("Rectangle");
		
		System.out.println("*********************************************");
//		3.
		Shape[]ss = new Shape[3];//배열선언 및 생성

		ss[0] = new Circle();
		ss[1] = new Rect();
		ss[2] = new Triangle();
		
		String []name = {"Circle","Rect","Triangle"};
		
		for(int i =0 ; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
		
	} 
}
