package ex05.Return;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println(x);
		x *=100;
		
		if( x == 500 ) return; //제어권 양도 리턴실행시 다음 단계 미실행
		
		System.out.println(x);
		System.out.println("여기까지 출력한다");
		
	
	}
}
