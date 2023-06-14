package ex04.inheritance;

import java.util.Scanner;

public class Triangle extends Shape { // 서브클래스
	
	public Triangle(){//계산 하는 calc, 보여주는 show
		Scanner sc = new Scanner(System.in);
		System.out.println("높이 값은 = ");
		this.w = sc.nextInt();
		System.out.println("넓이 값은 = ");
		this.h = sc.nextInt();
	}
	private void Super(int w, int h) {
		
	}
	public double calc () {
		this.result = (h*w/2);
		return result;
	}
	public void show() {
		System.out.println("높이 입력값 = "+ h +", 너비 입력값 = "+w);
		System.out.println("삼각형의 넓이  = "+calc()); 
	}
}
