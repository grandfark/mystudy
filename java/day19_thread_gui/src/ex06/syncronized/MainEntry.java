package ex06.syncronized;

class Atm{
	private int money;
	
	public Atm(int money) {
		this.money = money;
	}
	//입금함수
	public void deposit(int amount, String name) {
		money += amount;
		System.out.println(name + " : 입금금액 "+amount);
	}
	
	//출금함수 
	public void withdraw(int amount, String name) {
		synchronized (name) {
			if( (money - amount) > 0) {
			money -= amount;
			System.out.println(name + " : 출금금액 "+amount);
		}else {
			System.out.println(name+" : 출금불가 (잔액부족) ");
		}
		
		}//synchronized end
		
	}
	
	//통장잔고함수
	public void getMoney() {
		System.out.println("                              잔액은 :"+money);
	}
}//ATM end

class UserAtm extends Thread{
	Atm obj;
	boolean flag = false;
	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}
	@Override
	public void run() {//스레드 실행부
		for (int i = 0; i < 2; i++) {

			try {
				sleep(50);
			}catch(Exception e) {
				e.printStackTrace();
			}
			if( flag ) {
				obj.deposit((int)(Math.random() * 10 + 2)*100, getName());//입금/스레드가 가진 getName()
			}else{
				obj.withdraw((int)(Math.random() * 10 + 2)*100, getName());//출금
			}//if end
			
			flag = true;
			obj.getMoney();//잔고확인
		}//for end
	}//run end
	
}//UserATM end

public class MainEntry {
	public static void main(String[] args) {//잔액이 중구난방
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at,"박정희");
		UserAtm user2 = new UserAtm(at,"전두환");
		UserAtm user3 = new UserAtm(at,"노태우");
		
		user1.start();
		user2.start();
		user3.start();
	}
}
