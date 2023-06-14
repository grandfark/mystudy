package ex06.instance_static;

//instance method 객체 생성하고 사용

class B {
	int x, y;
	
	//instance method
	public void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}//B end
public class instanceMethod {
	public static void main(String[] args) {

		B b = new B();//인스턴스 B객체 생성 
		b.setData(22, 55);
	}
}
