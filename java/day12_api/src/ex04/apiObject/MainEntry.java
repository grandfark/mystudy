package ex04.apiObject;

class Point{	}
public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : "+pt.hashCode());//10진수 구조 주소  1651191114
		System.out.println("Object address :" +pt );
		System.out.println("Object String : "+pt.toString());//16진수 구조 주소 626b2d4a
		System.out.printf("10진수 주소 %d\n",0x626b2d4a);// 주소앞에 0x 를 붙여야 된다.
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : "+pt2.hashCode());//10진수 구조 주소  1651191114
		System.out.println("Object address :" +pt2 );
		System.out.println("Object String : "+pt2.toString());//16진수 구조 주소 7a79be86
		System.out.printf("10진수 주소 %d\n",0x7a79be86);// 주소앞에 0x 를 붙여야 된다.
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		
		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();//함수 생성으로 다르게 나온다.
		
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		Point pt4;//생성이 아닌 선언으로 같다
		
		pt4 = pt;
		
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}
}
