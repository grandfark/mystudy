package ex05.wrapper;

class Point{
	
}

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10); 
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);//pt 주소값 출력
		System.out.println(pt.toString()); //주소값 출력
		
		System.out.println(Ia);//레퍼런스 데이터는 실제 주소값을 가지고 있음
		
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));//a는 16진법에서 10이다.
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", "+y);
//		y = x;//묵시적 형변환
		x = (int)y;//명시적 형변환
		System.out.println(x + ", "+y);
		
		//Boxing vs UnBoxing
		int c = Ia.intValue();//jdk4.x이전에 사용하던 메소드
		int d = Ib;//jdk 5.x 이후에 autoboxing, unboxing
		int num = Integer.parseInt(su);
		
		System.out.println(c + num);

		System.out.println(c + d);
		
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		
//		double dd = 12.34;
		double dd = new Double (12.34);
		System.out.println(dd);
//		System.out.println(dd.MAX_VALUE);
//		System.out.println(dd.MIN_VALUE);
		
		System.out.println("=================================");
//		c = (int)dd.doubleValue();
		System.out.println("형변환 c 의 값은? " +c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("111111",2);
		System.out.println(f);
		System.out.println(e+20);
		
		int xx = 3; 
		Integer yy = new Integer(3);
		
		xx = yy.intValue();
		xx = yy;//autoboxing / unboxing
		
	}
}
