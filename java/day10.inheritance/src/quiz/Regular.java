package quiz;

public class Regular extends Employee{
	
	int salery, rank;
	
	public Regular(String name, String depart, String tel, int num, int rank) {
		super(name, depart, tel, num);
		this.rank = rank;
		setSalery();
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery() {
		switch (rank) {
		case 1: salery= 400000; break;
		case 2: salery= 300000; break;
		case 3: salery= 200000; break;
		case 4: salery= 100000; break;
		}
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void display() {
		super.display();
		System.out.println("급여 : "+salery);
	}
	
	
	/*
	int eplworkday, ptworkday, eplcost, ptcost;
	public int getEplworkday() {
		return eplworkday;
	}

	public void setEplworkday(int eplworkday) {
		this.eplworkday = eplworkday;
	}

	public int getPtworkday() {
		return ptworkday;
	}

	public void setPtworkday(int ptworkday) {
		this.ptworkday = ptworkday;
	}

	public Regular() {
		
	}

	public int getEplcost() {
		return eplcost;
	}

	public void setEplcost(int eplcost) {
		this.eplcost = eplcost;
	}

	public int getPtcost() {
		return ptcost;
	}

	public void setPtcost(int ptcost) {
		this.ptcost = ptcost;
	}

	public void display1() {
		System.out.println("근무일수 : "+eplworkday+"시간"+"\n시간당 단가 :"+eplcost+" 원"+"\n최종 금액 : "+(eplworkday*eplcost)+" 원");
	}
	public void display2() {
		System.out.println("근무일수 : "+ptworkday+"시간 "+"\n시간당 단가 :"+ptcost+" 원"+"\n최종 금액 : "+(ptworkday*ptcost)+" 원");
	}
	*/
}
