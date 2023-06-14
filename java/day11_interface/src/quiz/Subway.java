package quiz;

public class Subway implements Trans {

	@Override
	public void Start(String name) {
			System.out.println(name+"이 출발합니다.");
	}

	@Override
	public void Stop(String name) {
	
		System.out.println(name+"이 도착하였습니다.");	
		
	}

}
