package ex01.thread;

public class UserThread extends Thread {
	String name;

	public UserThread(String name) {
		this.name = name;
//		System.out.println("UserThread constructor" + name);
	}

	@Override
	public void run() {// 스레드 실행부(구현부)
		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				try {
					sleep(2000);// 1초간 중단 , 예외발생
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}//if end
			System.out.println(i);
		}//for end
	}

}
