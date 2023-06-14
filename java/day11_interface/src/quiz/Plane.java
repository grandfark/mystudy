package quiz;

public class Plane implements Trans{

	@Override
	public void Start(String name) {
				System.out.println(name+"가 출발합니다.");
	}

	@Override
	public void Stop(String name) {
		System.out.println(name+"가 도착하였습니다.");	
	}

}
