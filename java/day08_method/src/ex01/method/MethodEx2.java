package ex01.method;

public class MethodEx2 {
	
	public static String name (int x , String irum) {
		System.out.println("x = "+x);
		return irum;
	}
	
	public static String display (int x , String name) {
		
		for(int i = 0; i <= x ; i++) {
			System.out.println(name+"\t");
		}
		System.out.println();
		return name;
	}
	
	
	
	public static void main(String[] args) {
		
	System.out.println(display(10,"&"));
	System.out.print(display(20,"*"));
	
	
	System.out.println("================");
	String str = name(10, "park");
	System.out.println(str);
	
	System.out.println("name() call : "+ name(99,"gil dong"));
	}
}
