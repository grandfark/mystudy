package ex02.runnable;

public class MainEntry {

	public static void main(String[] args) {
		
		new Thread(new UserRunnable("u1")).start();//줄여쓰기
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
		
//		UserRunnable u1 =  new UserRunnable("u1");//풀어쓰기
//		Thread t1 = new Thread(u1);
//		t1.start();//run();
	}

}
