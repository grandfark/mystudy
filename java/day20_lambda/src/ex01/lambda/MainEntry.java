//package ex01.lambda;
//
//	interface Message {
//		void something();
//	}
//
//	class Person {
//		public void greeting(Message msg) {
//			msg.something();
//		}
//	}
//
//	public class MainEntry {
//		public static void main(String[] args) {
//			//Lambda Expression. JDK 1.8이상
//			Person p = new Person();
//			
//			p.greeting(new Message() {//일반적인 형태
//				@Override
//				public void something() {
//					System.out.println("good morning");
//					System.out.println("☆★");
//			}
//			});
//			System.out.println("************************");
//		
////			public int sum (int x , int y) { return x + y; }
////			(x , y)();
//			p.greeting(()->{});
//			System.out.println("Hello Lambda");
//			System.out.println("☆★");
//		
//		}
//
//	}
