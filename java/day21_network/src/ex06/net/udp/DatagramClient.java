package ex06.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;

		int port = 5000;
		String str;
		byte[] buffer = null;

		try {
			System.out.println("@@@ UDP File Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));//문자열 주소
			System.out.println("전송대상(Server IP) = ");
			String ipAddress = br.readLine();
			System.out.println("전송파일(파일명.확장자 ) = ");
			String fileName = br.readLine();
			File file = new File(fileName);
			
			if (!file.exists()) {// boolean타입
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(-1);
			}
			
			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress);// 문자열 ip주소를 실제 ip주소로 변환해 주는 작업
			
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);
			ds.send(dp);// 송신

			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			buffer = new byte[65536];

			while (true) {
				int count = dis.read(buffer, 0, buffer.length);

				if (count == -1)
					break;

				dp = new DatagramPacket(buffer, count, iaddress, port);
				ds.send(dp);
			}
			
			str = "end";
			buffer = str.getBytes();
			
			dp = new DatagramPacket(buffer, buffer.length, iaddress, port);// end 를 전송목적으로 생성
			ds.send(dp);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				br.close(); dis.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}
}
