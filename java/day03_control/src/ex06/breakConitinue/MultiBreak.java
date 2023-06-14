package ex06.breakConitinue;

public class MultiBreak {

	public static void main(String[] args) {

		boolean flag = true;
		
		firust:{
			second:{
				
				third:{
					
					int k = 100;
					System.out.println("Before the break");//1
					
					if (flag) break second;//break 식별자; 식별자 위치까지 탈출
					
					System.out.println("This won't execute");//2 식별자가 second 까지 탈출하므로 미출력
					
				}
				System.out.println("대보반 파이팅");//3 식별자가 second 까지 탈출하므로 미출력
			}
			System.out.println("This is after second break!!");//4 firust
		}//end
		
		System.out.println("123456");//5
	}

}
//식별자1 : { 
//	
//	식별자2 : {
//		
//		break 식별자1;//식별자1에 break를 사용한것과 같다
//		
//	}
//	
//}