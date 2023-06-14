package ex04.inheritance;

import java.util.Scanner;

public class Circle extends Shape {// sub class 자식클래스

	public Circle() {
		super(2, 3);// 반드시 첫 줄에 와야한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 값은 = ");
		this.w = sc.nextInt(); // w값을 입력 받다.
	}

	public double calc() {

		this.result = (w * w * Math.PI);

		return result;
	}

	public void show() {
		System.out.println("반지름 = " + w + ", 원의 넓이 = " + calc());
	}
}
