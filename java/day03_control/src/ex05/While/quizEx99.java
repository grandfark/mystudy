package ex05.While;

public class quizEx99 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		while (a < 8) {
			System.out.println("a = " + a);
			a++;
			while (b <= a) {
				System.out.println("b = " + b);
				b++;
			} // b end
			System.out.println("A * B = " + a * b);
		} // a end
	}
}
