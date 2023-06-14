package ex03.operator;

public class Operator {

	public static void main(String[] args) {
		//대입연산자: =, +=, -=, *=, /=, <<=, >>=
		int x = 2, y = 3, result;
		
		result = x + y;
		System.out.println(result);
//		x = x + y;
		x += y;// 처리속도가 2배이상 빠르다
		System.out.println(x);
		
//		x = x * y;
		x *=x= y;//처리속도가 2배이상 빠르다. 
		System.out.println(x);
		
		x = x +1; x +=1; x++; //모두 동일한 결과를 가진다.
		
	}

}
