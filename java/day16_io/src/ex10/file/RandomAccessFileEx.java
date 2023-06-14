package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.annotation.processing.SupportedSourceVersion;

public class RandomAccessFileEx {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {

//		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");// 예외발생 파일이 있다면 열고 없다면 추가한다.
		RandomAccessFile raf = new RandomAccessFile("C:\\daebo_th2\\1_Java\\workspace\\day16_io sawon.txt", "rw");
				
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100);
			String str = "hello";
			raf.writeUTF(str);
//			raf.writeInt(i);
		}
		
		for (int i = 0; i <= 10; i++) {
			raf.seek(i * 100);
//			System.out.println(raf.readInt());
			System.out.println(raf.readUTF());
		}
		
		System.out.println("String print Success!");
		raf.close();
	}
}
