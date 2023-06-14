package ex06.breakConitinue;
import java.util.Iterator;

public class MainEntry {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			
			if( i == 7 ) continue;
			
			System.out.println(i);
		}
	}		
}	
		
		
		
		
//		for (int i = 1; i < 11; i++) {
//			System.out.println("나는 I다."+i);
//			
//			for (int j = 1; j < 11; j++) {
//				if (i == 7)
//					break;
//				System.out.println("i=" + i);
//				System.out.println("j=" + j);
//			}//j 종료
//			
//			System.out.println();
//		}// i 종료

//		for (int i = 1; i < 11; i++) {
//			if (i == 7)
//				break;
//			System.out.println(i);
//		}

//	}
//
//}
