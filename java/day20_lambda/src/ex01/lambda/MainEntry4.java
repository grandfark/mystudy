//package ex01.lambda;
//
//interface Message {
//	int something(int x, int y); // int return type , parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("message interface something : " + su);
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//		// Lambda Expression. JDK 1.8이상
//		Person p = new Person();
//
//		p.greeting(new Message() {// 일반적인 형태
//			@Override
//			public int something(int x, int y) {
//				System.out.println("return type, parameterO good afternoon");
//				System.out.println("x = " + x + ", y = " + y);
//				return 954235;
//			}
//		});
//		System.out.println("************************");
//
////		public int sum (int x , int y) { return x + y; }
////		(x , y)();
//
//		p.greeting( ( x , y ) -> {// lambda 형태, 자료형 안써도 됨, 매개변수가 두개 이상인 경우 괄호를 써야 된다.
//			System.out.println("return type, parameterO , Hello MultiparaMeter Lambda");
//			System.out.println("Hello Weekend");
//			return 309015;
//		});
//	}
//
//}
