package ex03.thread;

public class MainEntry {
	public static void main(String[] args) 
			throws InterruptedException{
		
		long id = Thread.currentThread().getId();//JVM에서 임의 부여
		String name = Thread.currentThread().getName();
		
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Thread.State state = Thread.currentThread().getState();
		
//		if(id) {
		Thread.sleep(id);
		Thread.currentThread();
//		}
		
		int priority = Thread.currentThread().getPriority();
		
		
		System.out.println("현재 스레드 ID: "+id);
		System.out.println("현재 스레드 Name: "+name);
		System.out.println("현재 스레드 Priority: "+priority);
		System.out.println("현재 스레드 State: "+state);
	}
}
