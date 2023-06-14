package ex03.Enum;
/*
 Enum 열거형 - 새로운 클래스를 정의하는 것
 	- 특정한 값만을 가질 수 있는 데이터 타입을 정의할 때 필요하다.
 	형식[접근지정자] enum 열거형이름 {필요한 상수들 나열, .....} 
 */

//접근 지정자를 제외하면 public가 된다.

enum UserStatus{ //switch case 에 많이 사용한다. 클래스 내부, 외부에 존재할 수 있다.
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE
}

public class MainEntry {

	public static void main(String[] args) {
		
		System.out.println(Thread.State.BLOCKED);
		
		//1.
		System.out.println(UserStatus.DELETE);
		System.out.println("************************");
		//2. 
		for(UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}
}
