package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer token = 
				new StringTokenizer("사과=10| 초콜렛=3| 샴페인=1","=|",true);
		
		while(token.hasMoreTokens()) {//다음요소가 있는가
//			System.out.println(token.nextToken());
			String str = token.nextToken();
			if(str.equals("=")) {
				System.out.print("\t");
			}else if( str.equals("|")) {
				System.out.print("\n");
			}else {
				System.out.println(str);
			}
		}
		
	}
}



/*package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		StringTokenizer token = 
				//new StringTokenizer("박정희 노태우 전두환 김영삼");//구분자 역할의 디폴트 값은 공백이다.
				new StringTokenizer("박정희/노태우/전두환/김영삼","/");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
	}
}
*/