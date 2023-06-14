package quiz;

public class Salse extends Regular{
	private double cm = 0.5;
	public Salse(String name, String depart, String tel, int num, int rank) {
		super(name, depart, tel, num, rank);
		
	}
	
	public void display() {
		super.display();
		System.out.println("성과급 : "+super.salery*cm);
	}
	
}