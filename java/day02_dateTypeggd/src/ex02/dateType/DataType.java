package ex02.dateType;

public class DataType {
	public static void main(String[] args) {
		String str= "A";	//문자열," ", 2byte, \0 = null 을 달고 다니는 것과 같다. 그래서 2byte이다.
		char ch = 'A';		//문자, ' ' , 1byte
		char ch2 = 67;		
		char ch3 = 'b';		
		int su = 20; String nickname = "happy"; double d = 12.34;

		System.out.println(ch); 	//A
		System.out.println(str);	//A
		System.out.println((int)ch);	//ASCII 65
		System.out.println(ch2 + ch3);
		System.out.println("nickname = " + nickname);
		System.out.println("실수형 데이터 : "+ d);
		
		for(int i = 65; i <=90; i++) {
			System.out.print(i + " ");
		}//end for
		
		System.out.println("\n\n=======================");
		
		for(int i = 'a'; i <='z'; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
//		int b = flag;// error
		System.out.println(flag);
		
	}
}
