package ex01.Interface;

interface A{ //interface - abstract method, final field만 지닌다.
	int x =90;//Final static int x = 90; 동일	볼드체로 눕는순간 static으로 인식한다.
	final int y = 777;
	char ch = 'A';
	
	//추상메서드, abstract 생략가능, 무조건 추상메소드이다.
	public void show();// public abstract void show(); 와 동일하다.
	public abstract void disp();	
}//A end
interface B{
	void view();
	
}//B end

interface C{
	String name ="happy";//문자열 happy
	public void draw(); //추상메소드
}//C end

interface D extends B {
	void dview();
}//D end 
//***********************************************************************************************
class Rect implements D{

	@Override
	public void view() {//B interface
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dview() {//D interface
		// TODO Auto-generated method stub
		
	}
	public int plus (int x, int y) {
		return x+y;
	}
	
}//Rect class end

//***********************************************************************************************

class Shape{

}//Shape class

class Cicle implements C{
	
	@Override
	public void draw() {
//		name = "happy";
		System.out.println(name+"님 입니다.");
	}
	
}



class Multi extends Shape implements B ,C ,A {
//class Multi implements B, C, A extends Shape{
//	x=100; 상수화 되어 바꿀 수 없음 값변경 불가
	@Override
	public void show() {//A
		
	}

	@Override
	public void disp() {//A

	}

	@Override
	public void draw() {//C
		
	}

	@Override
	public void view() {//B
		
	}
	
	
	
}//Multi end


public class MainEntry {
	public static void main(String[] args) {
//		A a = new A();//클래스가 아니기에 객체생성은 불가능하다
		
		
	}

}
