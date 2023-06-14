package quiz;

public class Plain extends Trans {

	@Override
	public String Start(String name) {
		System.out.println(name+" 출발합니다.");
		return name;
	}

	@Override
	public String Stop(String name) {
		System.out.println(name+" 도착했습니다.");
		return name;
	}

}
