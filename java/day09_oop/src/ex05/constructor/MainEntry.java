package ex05.constructor;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV();//객체생성, 메모리할당, 생성자 함수 자동 호출
		tv.display();
		
		
		TV tv2 = new TV(25);
		tv2.display();
		
		tv.setChannel(7);
		tv.setColor("빨강");
		tv.display();
		
		TV tv3 = new TV("green");
		tv3.display();
		
		TV tv4 = new TV("회색",88);
		tv4.display();
		
		
//		tv.setColor("yellow");
//		tv.setChannel("십칠");
//		tv.TVoutput();
	}
}
