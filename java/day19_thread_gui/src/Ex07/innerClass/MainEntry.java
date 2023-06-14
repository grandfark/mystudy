package Ex07.innerClass;

import Ex07.innerClass.OuterClass.InnerClass;

class OuterClass{//외부클래스
	static int no;
	String message = "hello";
	
	public void outerMethod() {
		System.out.println("outer method call");
//		System.out.println(su);
//		show();
	}
	
	class InnerClass{//내부클래스는 외부 클래스의 종속적인 상태
		int su = 99; 
		public void show() {
			System.out.println(su);//내부(자신의 것) 사용가능
			System.out.println(message);//외부 클래스 멤버 사용 가능
		}
		public void disp() {
			outerMethod();//외부 클래스 메소드 호출가능
		}
		
	}//InnerClass end

}//OuterClass end

public class MainEntry {
	public static void main(String[] args) {
		//1. OuterClass 
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();//
		ic.disp();		ic.show();
		System.out.println("=========================");
		//2. OuterClass 축약
		OuterClass.InnerClass inner = new OuterClass().new InnerClass();
		inner.show();
	}
}
