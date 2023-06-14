package ex01.lambda;

//타입을 써야할 상황이 있다.
interface Message {
	void something(int x, int y); // parameter O
}
@FunctionalInterface
interface Talk{
		void something(String x, String y); // functional interface
}

class Person {
	public void greeting(Message msg) {
		msg.something(3, 5);
	}
	public void greeting(Talk msg) {
		msg.something("Hello","DaeBo");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {
		// Lambda Expression. JDK 1.8이상
		Person p = new Person();

//		p.greeting(new Message() {// 일반적인 형태
//			@Override
//			public void something (int x, int y) {
//				System.out.println("x = " + x + ", y = " + y);
//			}
//		});
		System.out.println("************************");

//		public int sum (int x , int y) { return x + y; }
//		(x , y)();
			
		char ch  = 'K';
		p.greeting( ( String x , String y ) -> {// lambda 형태, 자료형 안써도 됨, 매개변수가 두개 이상인 경우 괄호를 써야 된다.
			System.out.println("x = " + x + ", y = " + y);
//			ch = 'P';//람다 안에서는 일반적인 함수의 값을 바꿀 수 없다.
			
			num = 500;//static 값은 변경이 가능하다.
			System.out.println(num);//출력은 가능하다.
			
		});
	}
	
	static int num = 30;
}
