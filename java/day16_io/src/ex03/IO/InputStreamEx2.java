package ex03.IO;

import java.io.IOException;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		int su =  0;
						//throws IOException{} 예외처리 위임 - JVM
		System.out.println("데이터 입력 끝은 Ctrl + Z 를 누르시오");
		
		
		while ( (su = System.in.read()) != -1 ) {
			System.out.print( (char)su +1);
		}
		System.out.println("");
	}
}
