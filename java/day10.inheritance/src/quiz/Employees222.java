package quiz;

public class Employees222 {
	int innum, cost;
	String name, rank, team, tel;

	public int getInnum() {
		return innum;
	}

	public void setInnum(int innum) {
		this.innum = innum;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setData(int innum, int cost, String name, String rank, String tel, String team) {// 값변경이 적을때만 사용하면 괜찮으나
																									// 가능한한 사용하지 말것
		this.innum = innum;
		this.cost = cost;
		this.name = name;
		this.rank = rank;
		this.tel = tel;
		this.team = team;
	}

	public  Employees222() {//객체 생성(클래스 이름과 동일해야함)
		
	}
	
	public void Empl_display(){
		System.out.println(
				"사번 : " + innum + "\n이름 : " + name + "\n직급 : " + rank + "\n부서 : "
						+ team + "\n급여 : " + cost + "\n연락처 : " + tel);
	}
}
