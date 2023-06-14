package quiz;

public class quiz_weekend {

	public static void main(String[] args) {
//	과제1
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}//내부 for
//		}//외부 for
//	}

//과제2
//		for (int i = 1; i <11; i++ ) {
//		if(i%2==0) {
//		System.out.print("+"+i);
//	}else if (i%2==1)System.out.print(-i);
//}
//}
//}
		
//과제3
		
		for (double i = 1; i <11; i++ ) {
			if(i%2==0) {
					System.out.print(" + "+i);
			}else if (i%2==1)System.out.print(i);
			double result = i/(i+1);
			System.out.print(result);
		}
	}
}
//과제1] 	1 + (1 + 2) + (1 + 2 + 3 ) + ( 1 + 2 + 3 + 4 + 5) = ? 35
//과제2]	(-1) + 2 + ( -3 ) + 4 +(-5) + ...+ (-9) + 10 = ? 5
//과제3]  	1/2 +2/3+/3/4+ 4/5+5/6 +6/7+7/8+(8/7:원문에는 보이지 않습니다. 오타 추정됩니다.)+9/10 = ? 7.07