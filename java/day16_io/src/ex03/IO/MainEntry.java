package ex03.IO;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;//표준 입력
		
		
		try {
			
			System.out.println("단일 문자 입력 : ");
			int num = is.read()-48; // 예외발생, '0' ~ '9' 48 ~ 57 : 아스키 코드 
//			System.out.println((char)num);
			is.read(); is.read();//입력값이 스택영역으로 들어간다. enter도 들어가지만 한번 더 씀으로써 다음값을 위해 enter를 누르더라도 다음값이 출력 되도록하기 위함
			int num2  = is.read()-48;

			System.out.println(num + num2);//아스키 코드로 계산값 출력 -48을 하면 숫자가 숫자로 출력이 가능하다. 1은 1이 아니다. 출력시 49가 된다.
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//try & catch 로 묶거나 한다. 예외처리로 해결
	}
}
