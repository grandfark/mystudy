package ex02.Abstract;

public class Triangle extends Shape {
	int w =80, h =2;
	@Override
	public double calc(double x) {
		result = (x * h)/2.0;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);// 위의 calc의 double x 초기화 과정
		System.out.println(result + " 크기가 "+name+"이 그려졌습니다");

	}

}
