package ex03.overload;

public class memo {
	public static void main(String[] args) {
		line("*");
		line("$");
	}
	public static void line() {
		System.out.println("+=====================+");
	}
	public static void line(String str) {//배열 length:필드(배열의 크기) String: length(문자열의 길이)
		
		System.out.println("+=====================+");
	}
}

