package ex01.Abstract;

abstract class Shape {// abstract class, super class
	double result = 0;

	public abstract double calc();// abstract 제작

	public abstract void draw();

	public void show() {
		System.out.println("Super Class Shape");
	}
}// shape end

class Circle extends Shape { // 부모가 추상 클래스라 반드시 상속을 받아야 한다.

	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return 0;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("원의 넓이가 "+ result+" 인 원을 그렸습니다.");
	}

}// circle end

class Rect extends Shape {
	int w = 3 , h = 5;
	@Override
	public double calc() {
		result  = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이가"+ result+" 인 사각형을 그렸습니다.");

	}

}// Rect end

class Triangle extends Shape{
	int w = 5, h =7;

	@Override
	public double calc() {
		result = w * h / 2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이가 "+ result+" 인 삼각형을 그렸습니다.");
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rect r = new Rect();
		r.draw();
		
//		Shape sh = new Shape();//자체적으로 객체 생성이 불가능하다.
		Shape sh = new Circle();//상속 받은 자식 클래스로는 객체 생성이 가능하다.
		
		Triangle tri = new Triangle();
		tri.draw();
	}
}