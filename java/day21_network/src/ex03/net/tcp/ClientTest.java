package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {// 소켓 1개 필요
//socket(IP, PORT);
//	I/O 객체 생성
//	tcp의 원리는 자바를 비롯한 모든 언어에서 비슷하다.
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("192.168.0.144", 9000);//서버측 IP주소와 포트넘버를 이용하는게 빠르다.
			
			//I / O
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			String str = "Hello Server";
			os.write(str.getBytes());
			
			byte [] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} 
}
