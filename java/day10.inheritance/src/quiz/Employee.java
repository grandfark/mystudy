package quiz;

public class Employee {
	
	
	String name, depart, tel;
	int num;
	public Employee(String name, String depart, String tel, int num) {
		super();
		this.name = name;
		this.depart = depart;
		this.tel = tel;
		this.num = num;
	}
	
	public void display() {
		System.out.println("사번 :"+num+"\t이름: "+ name + "\n부서:"+ depart + "\n연락처 :" +tel);
		
	}
	
	
	
	/*
	String eplname, ptname, epldepart, ptdepart, pttel, epltel, eplrank, ptrank;
	
	public String getEplrank() {
		return eplrank;
	}

	public void setEplrank(String eplrank) {
		this.eplrank = eplrank;
	}

	public String getPtrank() {
		return ptrank;
	}

	public void setPtrank(String ptrank) {
		this.ptrank = ptrank;
	}

	public String getPtdepart() {
		return ptdepart;
	}
	int eplnum, ptnum;

	public Employee() {

	}

	public String getEpldepart() {
		return epldepart;
	}

	public void setEpldepart(String epldepart) {
		this.epldepart = epldepart;
	}

	public String getPedepart() {
		return ptdepart;
	}

	public void setPtdepart(String pedepart) {
		this.ptdepart = pedepart;
	}

	public String getPttel() {
		return pttel;
	}

	public void setPttel(String pttel) {
		this.pttel = pttel;
	}

	public String getEpltel() {
		return epltel;
	}

	public void setEpltel(String epltel) {
		this.epltel = epltel;
	}

	public String getEplname() {
		return eplname;
	}

	public void setEplname(String eplname) {
		this.eplname = eplname;
	}

	public String getPtname() {
		return ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

	public int getEplnum() {
		return eplnum;
	}

	public void setEplnum(int eplnum) {
		this.eplnum = eplnum;
	}

	public int getPtnum() {
		return ptnum;
	}

	public void setPtnum(int ptnum) {
		this.ptnum = ptnum;
	}

	public void epldisplay() {
		System.out.println("사번: " + eplnum + "\n이름: " + eplname + "\n부서: " + epldepart + "\n연락처 : " + epltel);
	}
	public void ptdisplay(){
		System.out.println("사번: " + ptnum + "\n이름: " + ptname + "\n부서: " + ptdepart + "\n연락처 : " + pttel);
	}
	public void alldisplay() {
		System.out.println("사번: " + eplnum + "\n이름: " + eplname + "\n부서: " + epldepart + "\n연락처 : " + epltel);
		System.out.println("사번: " + ptnum + "\n이름: " + ptname + "\n부서: " + ptdepart + "\n연락처 : " + pttel);
	}*/
}
