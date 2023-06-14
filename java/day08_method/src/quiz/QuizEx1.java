package quiz;

public class QuizEx1 {

	public static void main(String[] args) {
		add(1,2);
		sub(4,5,6);
		message(); //변수 안씀
	}
	public static void add(int a,int b) {
		System.out.println(a + b);
	}
	public static void sub(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	public static void message() {
		System.out.println("hi");
		System.out.println("good Morning");
	}
}
//add(int ,int) sub(1,2,3, 인자값 상관없음), message(단순 인삿말)