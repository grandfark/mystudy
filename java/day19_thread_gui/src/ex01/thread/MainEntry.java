package ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread("T1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
	
		
		t1.setPriority(Thread.MIN_PRIORITY);	//1  최소값
		t2.setPriority(Thread.NORM_PRIORITY);	//5  기본값
		t3.setPriority(Thread.MAX_PRIORITY);	//10 최대값
		
		System.out.println(Thread.currentThread().getName());//현재 이름 출력
		System.out.println(Thread.currentThread().getState());//상태 출력
		//		t1.run();	//run() run메소드 호출. 실행아님
		t1.start(); //run() method 유도	
		t2.start();	
		t3.start();
	}
}
