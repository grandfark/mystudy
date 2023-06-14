//*
package ex01.operater;

//최단산쉬간논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//관계 연산자 : < , >, <=, >=, ==(같다) , !=(같지않다)
	int x = 20, y = 21;
		if(x != y) {
			System.out.println("같지 않다");
		}else {
			System.out.println("같다");
		}
		System.out.println("=================");
		int a = 20, b = 21;
		if(a == b) System.out.println("같지 않다");
		else System.out.println("같다");
	
	} 
	
}
//*/

/*
package ex01.operater;

//최단산쉬간논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//shift 연산자 : <<, >> ,<<< 곱셈과 연관 있음. 
		int x = 8, result;
//		result = x << 2; //left shift:원래값 * 2^bit 수 => 8 * 4 = 32
		result = x >> 3;// right shift: 원래값 / 2^bit 수 => 8 / 8 = 1 
		System.out.println("Shift result:" + result);
	} 
}
*/