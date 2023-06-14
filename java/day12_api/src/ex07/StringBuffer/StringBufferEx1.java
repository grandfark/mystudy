package ex07.StringBuffer;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode());//1865127310
		
		
		System.out.println("length    /    capacity");
		System.out.println(sb.length()+"         /       "+sb.capacity());
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len+"         /       "+size);
		
		sb.append("daebo");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"         /       "+size);
		
		sb.append("happyvirus");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"        /       "+size);
		
		sb.append("12345 67890");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"        /       "+size);
		

		sb.append("12345 67890");
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"        /       "+size);
		
		System.out.println(sb.hashCode());//1865127310
		
		sb.trimToSize(); //메모리 용량 크기 조절
		len = sb.length(); size = sb.capacity();
		System.out.println(len+"        /       "+size);
	}
}
