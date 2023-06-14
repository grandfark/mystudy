package ex03.MultiImplements;

import ex02.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		//1. 자기자신
		MultiClass mc = new MultiClass();
		mc.view();
		mc.testView();
		mc.draw();
		System.out.println(mc.su);
		System.out.println("+++++++++++++++++++++");
		//2. 부모로 객체 설정
		Shape s = new MultiClass();//인스턴스 설정 멀티클래스
		s.show("도형이다");
		s.view();
		
		System.out.println("=======");
		Test t = new MultiClass();
		t.testView();
		System.out.println(t.str);
		
		System.out.println("=======");
		IDraw d = new MultiClass();
		d.draw();
		System.out.println(d.su);
		
		
		
	}
}