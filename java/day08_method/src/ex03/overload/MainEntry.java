package ex03.overload;

public class MainEntry {//오버로드
	public static void main(String[] args) {
			plus(12.34);
			plus(20);
			plus("hello ");
			line("*");
			line(20,"*"); 	//호출부
	}
	public static void plus(int x){ //정의부 
		System.out.println(x+100);
	}
	public static void plus(int x, int y){
		System.out.println(x + y);
	}
	public static void plus(double x){
		System.out.println(x+100);
	}
	public static void plus(String x){
		System.out.println(x+100);
	}
	public static void line() {
		System.out.println("-------------------");
	}
	public static void line(String str) {
		System.out.println("+=====================+");
	}
	public static void line(int n , String str) {
		for( int i =1 ; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static void line(int n , int y ,String str) {
		for( int i =1 ; i < y; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
}
