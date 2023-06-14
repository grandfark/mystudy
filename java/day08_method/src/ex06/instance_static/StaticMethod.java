package ex06.instance_static;

//static - method 객체 생성없이 바로 생성가능함ex) Math.random()
//object.methodName();
//ClassName.methodName();
//

class A{
	int x, y;
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}//A class end
//서로 다른 클래스 끼리는 서로 직접적으로는 불가능하다
//그를 가능하기 위해 인스턴스 오브젝트를 생성한다.
public class StaticMethod {
	
	public static void main(String[] args) {
		A a = new A();//객체생성, 메모리 할당, 생성자 자동호출
		
		A.setData(100, 500);//ClassName.methodName();
		a.x=999;
		A.setData(3, 4);
		
		a.setData(22, 33);//objectName.methodName();
	}
}
