package ex04.apiObject;

class Rectangle {//extends Object{
	int x, y;
	public void disp() {//출력 함수 따로 만들었음
		System.out.println(x+", " + y);
		
	}
//	public String toString() {	
//		return x+", " + y;
//	}
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}

}
public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println("* - * - * - * - * - *");
		
		System.out.println(r.toString());
		
		System.out.println(r);//r.toString()
	}
}
