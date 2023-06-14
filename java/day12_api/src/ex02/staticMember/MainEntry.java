package ex02.staticMember;

class Atm {
	int count;// instance member 객체생성해야만 사용가능
	static int total;// static member

	public Atm(int amount) {// constructor method
		count += amount;
		total += amount; // total = total+ amount;

	}

	// static 멤버에서 일반 멤버변수는 사용할 수 없다.
	public static void view() {
		total = total + 100;
//		count = count + 100; //static이 아닌것은 올 수 없다.
	}

	public static void show(int count, int total) {//static이 있으면 this함수를 사용할 수 없다. heap 영역과 Constructor(static)에 들어 있는 주소가 서로 다르기 때문
//		this.count = count;
//		this.total = total;
	}

	public void display() {//일반 메소드는 가능하다.
		count += 50;
		total += 30;
		System.out.println("Count  = " + count);
		System.out.println("Total  = " + total);
	}

}// Atm end

public class MainEntry {
	public static void main(String[] args) {//시작점(진입점)
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display();// c:1000 total: 1000
		System.out.println("***********************");
		Atm at2 = new Atm(1000);
		at2.display();// c:1000 total: 2000
		Atm at3 = new Atm(1000);
		at3.display();// c:1000 total: 3000
	}
}
