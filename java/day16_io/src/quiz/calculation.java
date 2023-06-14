package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class calculation {
	public static void main(String[] args) 
		throws IOException{
		System.out.println("* * * 사칙연산 프로그램 * * *");
		System.out.println("두 값을 입력하시오.");
		
		BufferedReader bp = new BufferedReader(new InputStreamReader(System.in));	
		
		String str1 = bp.readLine();
		String str2 = bp.readLine();
		
		double result = 0;
		
		int su1 = Integer.parseInt(str1);
		int su2 = Integer.parseInt(str2);
		System.out.println("입력한 값 \n첫번째 수 : "+ su1 + "\t두번째 수 : "+su2);
		System.out.println("연산할 기호를 고르시오. \n더하기: + \t빼기: - \n곱하기: * \t나누기: /");
		String cc = bp.readLine();
		
		switch(cc) {
		case("+"): 
			result = su1 + su2; 
		break;
			
		case("-"): 
			result = su1 - su2;
		break;
		
		case("*"): 
			result = su1 * su2;
		break;
		
		case("/"): 
			result = su1 / su2;
		try{
			if(su2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		break;
		
		}System.out.printf(su1+" "+cc+" "+su2 +" = "+result );
		System.out.println("\n프로그램을 종료합니다.");
	}
}
//사칙연산 프로그램
//IO객체 이용하기