package ex02.dateType;

public class dataType2 {
	//모든 자료형은 자신의 범위를 벗어나지 않는다. 
	public static void main(String[] args) {
		short sh = 32767;//-32,768 ~ 32,767
		int num = 50000;//-21억 ~ 21억
		//작은 자료형이 큰 자료형으로 형변환 없이 대입하는건 문제가 없다 (묵시적 형변환)
		num = sh; //int(4byte) = short(2byte) 작은 자료형이 큰 자료형 으로 대입하는건 문제가 없다 (명시적 형변환)
		//큰 자료형이 작은 자료형으로 들어가면 형변환이 있어야한다.(명시적 형변환) 데이터 손실 가능성 존재
		
		
		System.out.println(sh + " : " + num);
//		num = -32769;
		num = 32770;
		sh = (short)num;	//명시적 형변환 short(2byte) -> int(4byte)
		System.out.println(sh + " : " + num);
	}
}

/* main은 하나만 존재가 가능하다.
public class dataType2 {
	//모든 자료형은 자신의 범위를 벗어나지 않는다. 
	public static void main(String[] args) {
		short sh = 32767;//-32,768 ~ 32,767
		int num = 50000;//-21억 ~ 21억
		
		System.out.println(sh + " : " + num);
//		num = -32769;
		num = 32770;
		sh = (short)num;//명시적 형변환
		System.out.println(sh + " : " + num);
	}
}
*/
// 한줄 주석
/* 범위 주석 */