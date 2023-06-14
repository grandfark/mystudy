package quiz2;

public class MainEntry {
	public static void main(String[] args) {
		Transport t = new Bus();//interface Transport 자체는 생성자로 사용 불가
		t.move();
		t.stop();
	}
}
