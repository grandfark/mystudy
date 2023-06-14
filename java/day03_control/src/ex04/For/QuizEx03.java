package ex04.For;

public class QuizEx03 {
	public static void main(String[] args) {
		System.out.println("전체 구구단");
		for (int i = 1; i < 10; i++) {// 개행
			System.out.println();
			for (int j = 1; j < 10; j++) {// 개열
				if (j > 0 && j < 10) {
					System.out.printf("%d %d = %2d \t",j,i,(i*j));
				}
			} // i end
		} // j end

	}
}
