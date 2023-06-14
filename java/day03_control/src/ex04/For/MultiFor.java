package ex04.For;

public class MultiFor {
	public static void main(String[] args) {		
		
		
		for (int i = 5; i <= 1; i--) {
			System.out.println(i+"*");
			for (int j = 1; j <= 5; j++) {
				System.out.print(j+"*");
			} // j end
			
		} // i end
	}
}


//public class NultiFor {
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 2; i++) {
//			for (int j = 1; j <= 3; j++) {
//				System.out.print(j + "\t");
//			} // j end
//			System.out.println();
//		} // i end
//	}
//}
