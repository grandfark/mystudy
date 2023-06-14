package ex05.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfomation {
	public static void main(String[] args) 
			throws IOException {

		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name = ");	//상대경로 - memo.txt (현재 작업하는 공간)
											//절대경로 - C:\daebo_th2\1_Java\workspace\day16_io\src\ex05\memo.txt
											//			 C:/daebo_th2/1_Java/workspace/day16_io/src/ex05/memo.txt
		System.in.read(fileName);//예외발생
		
		strName = new String(fileName).trim();//위에서 읽어낸 파일이름 문자열로 변환

		file = new File(strName);//형변환과 같은 원리로 진행한다.
		
		System.out.println("절대경로 : "+ file.getAbsolutePath());
		System.out.println("표준경로 : "+ file.getCanonicalPath());
		System.out.println("최종수정일 : "+ new Date(file.lastModified()));
		System.out.println("파일크기 : "+ file.length());
		System.out.println("읽기속성 : "+ file.canRead());
		System.out.println("쓰기속성 : "+ file.canWrite());
		System.out.println("파일경로 : "+ file.getPath());
		System.out.println("숨김속성 : "+ file.isHidden());
		
		
	}
}
