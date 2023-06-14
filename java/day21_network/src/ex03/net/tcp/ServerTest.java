package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {//소켓 2개 필요
	//서버소켓 필요 시작 - Accept
	//client에서 사져온다.
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("server start~~");
		
		try {
			ss = new  ServerSocket(9000);//0~1024 포트 넘버는 예약되어있음
			s = ss.accept();//client socket, 응답대기
			//I / O
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			byte [] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			String message = "안녕 client";
			os.write(message.getBytes());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();	ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//try end
		
	} 
}
