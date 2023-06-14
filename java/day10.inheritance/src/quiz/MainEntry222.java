package quiz;

public class MainEntry222 {
	public static void main(String[] args) {
		Employees222 dis = new  Employees222();
		
		 
		dis.setInnum(0);//사번
		dis.setName("빨강");//이름
		dis.setCost(80);//급여
		dis.setRank("사원");//계급
		dis.setTeam("개발");//부서
		dis.setTel("010-1234-6789");//연락처
		dis.Empl_display();
		System.out.println("===================");
		Employees222 dis2 = new  Employees222();
		dis2.setInnum(8);//사번
		dis2.setName("노랑");//이름
		dis2.setCost(77);//급여
		dis2.setRank("대리");//계급
		dis2.setTeam("영업");//부서
		dis2.setTel("010-9876-5432");//연락처
		dis2.Empl_display();
	}
}
