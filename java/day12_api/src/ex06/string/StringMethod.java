package ex06.string;

import java.util.Iterator;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "park";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.replace("EO", "KOREA"));
		System.out.println(s2);
		s2 = s2.replace("EO", "KOREA");
		System.out.println(s2);
		System.out.println("***************************************");
		s1  = s1 + s2;
//		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println("***************************************");
		String s3 = new String("           ab           cd            ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim();//공백제거(단, 문자열 중간은 공백제거 하지 못한다.
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("***************************");
		
//		String s4 = new String("ab ded 456123 sdgsdg 456450");
		String s4 = new String("ab/ded/456123/sdgsdg/456450");
//		String[] s5 = s4.split(" ");//공백이 구분자 역할을 한다.
		String[] s5 = s4.split("/");//구분자 역할을 / 로 지정한다.
		for( int i =0 ; i < s5.length; i++) {
			System.out.println("분리된 "+i+"번 문자열 " +s5[i]);
		}
		System.out.println("***************************************");
		String s6 = "123-456-7890";
		String [] s7 = s6.split("-"); 
		for( int i =0 ; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		System.out.println("***************************************");
		
		String s8 = "21231123sdgsdgsdg 123132138 1231231 string";
		char ch = s8.charAt(8);
		System.out.println(ch);
		
		
		s8 = s8.substring(5,7);
		System.out.println(s8);
		
		System.out.println("*******************************");
		System.out.println("소문자로 출력 : "+s2.toLowerCase());
		System.out.println("대문자로 출력 : "+s1.toUpperCase());
		System.out.println(s2);
		
		char[] ch2 = s1.toCharArray();
		for(int i =0; i< ch2.length; i++) {//문자열은 .length() 문자열이 아니면 .length로 충분하다.
			System.out.println(ch2[i]+"\t");
		}
		
	}
}
