package ex01_randomMethod;

public class MainEntry {

	public static void main(String[] args) {

		System.out.println(Math.random());
//		Math.random() * n <== 0~ n-1값 출력
		System.out.println(Math.random()*10);//0~9
		
		System.out.println(1+(int)(Math.random()*10)+1);//1~10
		
	}

}
