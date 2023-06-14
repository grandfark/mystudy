package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str  = "Hello";
		System.out.println("str : "+str);
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str : "+str);
		System.out.println("kbs");
		
		String msg = "cdefgji";
		System.out.println("Korea" + msg);
		System.out.println(msg);
		
		msg = msg.concat(" Korea");
		System.out.println(msg);
		
		String str2 = "abcdef123456".substring(2);
		System.out.println(str2);
		
		str2 = "abcdef123456asdgsdag".substring(2, 5);
		System.out.println(str2);

	}
}
