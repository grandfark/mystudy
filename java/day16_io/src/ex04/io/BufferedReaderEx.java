package ex04.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;

public class BufferedReaderEx {
	public static void main(String[] args) 
		throws IOException{
	
	/*
	InputStream is = System.in;
	Reader reader = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(reader);
	*/
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
	System.out.println("charactor input = ");
	String str = br.readLine();//예외발생, 여러개의 데이터 입력 받기
	
	System.out.println(str);
	
	}
}
