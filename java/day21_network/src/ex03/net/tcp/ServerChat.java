package ex03.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
	public static void main(String[] args)  throws IOException {
		
		int port = 8000;
		ServerSocket ss = new ServerSocket(port);
		Socket client = null;
		System.out.println("Chat server start~~");
		
		while(true) {
			client = ss.accept();
			InputStream is = client.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			PrintStream ps = new PrintStream(System.out);
			
			ps.print( client.getInetAddress().getHostAddress() );
			String str = br.readLine();
			byte[] buffer = str.getBytes("UTF-8");
			String message = new String (buffer,"utf-8");
			
			ps.println("    :   에서 수신메세지 ===>"+message);
			br.close();
			client.close();
			
		}//while end
	}
}
