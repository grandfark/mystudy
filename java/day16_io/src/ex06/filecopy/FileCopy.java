package ex06.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException{//예외처리
		//읽기 객체 생성 - FileInputStream  
//		InputStream is = new FileInputStream("dogs.jpg");//상대경로
		InputStream is = new FileInputStream("C:\\daebo_th2\\1_Java\\workspace\\day16_io\\dogs.jpg");//절대경로
		
		//쓰기 객체 생성 - FileOutputStream
		OutputStream os = new FileOutputStream("daebo3.png");//다른 파일형식으로 카피한다.
		
		byte[] buffer = new byte[1024 * 8];//데이터를 옮기는데 도움이 되는 시간
		
		long start = System.currentTimeMillis();// 복사 시작 시간
		
		while(true) {
			int inputData = is.read(buffer);//buffer 크기만큼 읽어들임
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		
		long end = System.currentTimeMillis();// 복사 종료 시간
		
		System.out.println(end - start);//복사 작업에 소요된 시간
		
		is.close(); os.close();
		System.out.println("copy Sucess!");
	}
}
/*
public static void main(String[] args) 
		throws FileNotFoundException, IOException{//예외처리
	//읽기 객체 생성 - FileInputStream  
//	InputStream is = new FileInputStream("dogs.jpg");//상대경로
	InputStream is = new FileInputStream("C:\\daebo_th2\\1_Java\\workspace\\day16_io\\dogs.jpg");//절대경로
	
	//쓰기 객체 생성 - FileOutputStream
	OutputStream os = new FileOutputStream("copyright.png");//다른 파일형식으로 카피한다.
	
	long start = System.currentTimeMillis();// 복사 시작 시간
	
	while(true) {
		int inputData = is.read();
		if(inputData == -1) break;
		os.write(inputData);
	}
	
	long end = System.currentTimeMillis();// 복사 종료 시간
	
	System.out.println(end - start);//복사 작업에 소요된 시간
	
	is.close(); os.close();
	System.out.println("copy Sucess!");
}
}
*/