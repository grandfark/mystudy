package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
//		Circle cc = new Circle();
//		System.out.println(cc);//cc의 주소값이 출력된다
//		cc.show();
//		
//		Triangle tri = new Triangle();
//		tri.show();
		
		Shape sh = new Shape();
		sh.show();
		
		sh = new Triangle();
		sh.show();
		
		
//		Shape c2 = new Circle();
	}
}
