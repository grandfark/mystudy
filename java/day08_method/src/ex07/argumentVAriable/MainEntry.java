package ex07.argumentVAriable;

public class MainEntry {

	public static void plus(int...x) {//...x 는 오타가 아니라 변수의 갯수가 고정되지 않을 때 사용하는 방식이다.
		int sum = 0 ;
		for(int i =0 ; i < x.length; i++) {
			sum += x[i];
			System.out.print(x[i]+"\t");
		}
		System.out.println("sum = "+sum);
	}
	
	public static void main(String[] args) {
		
		plus(1,2);
		plus(200);
		plus(1,2,3,4,5);
		plus(10,20,30,40,50,60,70,80,90);
		plus("kbs ","mbc ");//
		plus("a","b","c","d","sdgsd","23");
	}
	public static void plus(String...x) {
		String sum = "";
		for(int i =0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = "+sum);
	/*
	private static void plus(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	private static void plus(int i, int j, int k, int l, int m, int n, int o, int p, int q) {
		// TODO Auto-generated method stub
		
	}

	private static void plus(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		
	}

	private static void plus(int i) {
		// TODO Auto-generated method stub
		
	}

	private static void plus(int i, int j) {
		// TODO Auto-generated method stub
	*/	
	}
}