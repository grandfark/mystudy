package ex02.scanner;

import java.util.Scanner;

//import java.lang.*;//내부적으로 자동으로 임포트되고 있었다.

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //객체생성, 메모리 할당, 생성자함수자동호출
		System.out.println("정수데이터 입력 요망 : ");
		int su = sc.nextInt();
		
		System.out.println("\n입력 받은 수 : " +su);
		//주석 Ctrl + /:한줄주석
		//Ctrl + shift + / : 범위주석 설정
		//Ctrl + shift + \ : 범위주석 해제
	}
}
