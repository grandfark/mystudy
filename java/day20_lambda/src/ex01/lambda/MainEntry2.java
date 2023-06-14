//package ex01.lambda;
//
//interface Message {
//	int something();	//int return type , parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("message interface something : "+ su);
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//		//Lambda Expression. JDK 1.8이상
//		Person p = new Person();
//		
//		p.greeting(new Message() {//일반적인 형태
//			@Override
//			public int something() {
//				System.out.println("return tyep good afternoon");
//				System.out.println("☆★");
//				return 100;
//			}
//		});
//		System.out.println("************************");
//		
////		public int sum (int x , int y) { return x + y; }
////		(x , y)();
//		p.greeting(() ->{
//		System.out.println("Hello Return Lambda");
//		System.out.println("Hello Weekend");
//		return 200;
//		});
//	}
//
//}
