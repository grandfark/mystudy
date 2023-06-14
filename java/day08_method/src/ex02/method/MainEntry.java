package ex02.method;

public class MainEntry {

	public static void main(String[] args) {
		
		if(args.length != 1 ) {
			System.out.println("Using Data Error");
			return;//제어권 양도
		}
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		String s1 = args[0];//1번째를 입력 받아라
		String s2 = args[1];//2번째를 입력 받아라
		String s3 = args[2];//3번째를 입력 받아라
		
		System.out.println("===============");
		System.out.println(s1 + ", "+ s2+ ", "+ s3);
		System.out.println("plus = "+s1 + s2+ s3);

	
	//입력받은 변수를 숫자로
		int num1 =Integer.parseInt(s1);
		int num2 =Integer.parseInt(s2);
		int num3 = Integer.parseInt(s3);
		System.out.println("plus = "+(num1+num2+num3));
		}
}
