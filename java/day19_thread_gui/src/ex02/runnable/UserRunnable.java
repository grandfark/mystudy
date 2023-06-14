package ex02.runnable;

public class UserRunnable implements Runnable {
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				try {
					Thread.sleep(1000);
					System.out.println("출력합니다.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}//if end
			System.out.println(i);
		}//for end
	}

}
