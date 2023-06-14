package ex04.For;

public class ForStar {
	public static void main(String[] args) {

		// 정삼각형
		for (int i = 1; i <= 5; i++) {// row 개행

//			for (int j = 5; j >= 6 - i; j--) {
//			for (int j = 5; j >= 6 - i; j--) {// col "*" 출력
//			for (int j = 1; j <= 6 - i; j++) {//역삼각형 조건
			for (int j = 1; j <=  i; j++) {
				System.out.print("*");
			} // j end
			System.out.println();
		} // i end
	}
}
