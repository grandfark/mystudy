package ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {	//outerclass 

		HashMap clients;	//key, value
		
		public TcpMultiChatServer() {	//생성자 함수 - 멤버변수 초기화 담당
			clients = new HashMap();	//HashMap 객체생성
			Collections.synchronizedMap(clients);	//동기화
		}
	
		public void start() {//user method
			ServerSocket ss = null;// server socket 1
			Socket s = null; // client socket 2
			
			try {
				ss = new ServerSocket(8989);
				System.out.println("서버가 시작되었습니다. 채팅을 시작합니다!");
				
				while(true) {
					s = ss.accept(); //응답대기, 클라이언트 소켓
					System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하였습니다.");
					ServerReceiver thread = new ServerReceiver(s);//user class
					thread.start();//
				}//end while
				
			}catch(Exception e) {	e.printStackTrace(); }
			
		}//end start()
	
		class ServerReceiver extends Thread{//runnable나 thread 를 상속하면 run 을 사용할 수 있다. 제일 중요
			Socket s; //client socket
			
			DataInputStream dis; 	//readxxx()에 대응 - XXX: 자료형
			DataOutputStream dos;	//writexxx()
			
			private void sendToAll(String msg) {
				Iterator it = clients.keySet().iterator();//key 값 출력
				
				while(it.hasNext()) {//요소가 있다면
					try {
						DataOutputStream dos = (DataOutputStream) clients.get(it.next());// 해당키 값으로 value값 출력
//						System.out.println("dos.tostring() :"+dos.toString());
						dos.writeUTF(msg);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}//end sendToAll
			
			
			public ServerReceiver(Socket s) {//생성자 함수
				this.s = s ;
				try {
					dis = new DataInputStream(s.getInputStream());//네트워크 통해서 읽기
					dos = new DataOutputStream(s.getOutputStream());//네트워크 통해서 쓰기
				}catch(Exception e) {	e.printStackTrace();	}
			}//end constructor

			@Override
			public void run() {//thread 실행부(구현부)
				String name = "";
				try {
					name = dis.readUTF();
					sendToAll("#"+name+" 님이 입장하셨습니다.");
					clients.put(name, dos);//HashMap 넣기
					System.out.println("현재 서버 접속자 수는 : "+ clients.size()+ " 입니다.");//접속자 수 확인
					
					while( dis != null ) {
						sendToAll(dis.readUTF());
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					sendToAll("#"+name+" 님이 나가셨습니다.");
					clients.remove(name);
					System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속을 종료하였습니다.");
					System.out.println("현재 서버 접속자 수는 : "+ clients.size()+ " 입니다.");//접속자 수 확인
				}//end try
			}//end run
			
			
		}//end ServerReceiver class
		
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}//outer class end
