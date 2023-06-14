package ex04.apiObject;

class Circle {
	int x = 5, y = 5; // Heap 메모리 영역 할당

}

public class EqualsMain {
	public static void main(String[] args) {// Stack 메모리 영역 할당
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		if (c1 == c2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		int x = 3, y = 3;// 실제 데이터 삽입 장소
		System.out.println("기본 자료형 비교");
		if (x == y) {
			System.out.println("Same");
		} else {
			System.out.println("not Same");
		}

		
		System.out.println("참조 자료형 비교");//
		String str1 = new String("korea");
		String str2 = new String("Korea");
		if (str1 == str2) {//stack 영역의 값 비교
			System.out.println("Same");
		} else {
			System.out.println("not Same");
		}
		
		System.out.println("*** equals() method 비교 ***");
		if(str1.equals(str2)) {
			System.out.println("same");
		}else {
			System.out.println("not Same");
		}
		
		System.out.println(" - - - - - - - - - - - - - - - - - - - ");
		System.out.println("*** equals() method 비교 ***");//ASCII 코드값 비교 한다. 대소문자 구분한다.
		if(str1.equalsIgnoreCase(str2)) {//대소문자 구분안한다.
			System.out.println("same222");
		}else {
			System.out.println("not Same222");
		}
	}
}
