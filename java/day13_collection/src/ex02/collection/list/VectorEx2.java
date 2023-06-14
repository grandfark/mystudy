package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector<>(3, 5);

		v.addElement("자바");// string
		v.addElement(new Double(10.2));// double
		v.addElement(date);// object

		System.out.println("******** 3개 객체 추가 ***********");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("******** 10개 객체 추가 ***********");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());

		System.out.println("******** Vector 내용 출력 ***********");
		Enumeration enu = v.elements();

		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}

		System.out.println("\n******** 객체 내용 포함 확인 ***********");
		if (v.contains("자바")) {
			System.out.println("자바 문자열 포함");
		} else {
			System.out.println("자바 문자열 미포함");
		}

		System.out.println("10.2 객체의 위치는 " + v.indexOf(new Double(10.2)));
		System.out.println("입력시간 : " + date);
		System.out.println(v.get(v.indexOf(date)));

		// date object delete
		v.removeElementAt(v.lastIndexOf(date));
		System.out.println("**************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);

		for (i = 0; i < v.size(); i++) {
//			v.removeElementAt(i);
//			v.remove(i);//배열의 특벙번째 수 제거
			v.remove(10.2);//객체 이름으로 제거
			v.remove("자바");
//			v.removeAllElements();//배열 모두 제거
		}
		System.out.println("**************************");
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
		System.out.println(v);

		
		for(i = 0 ; i < v.size(); i++) {
			System.out.print(v.get(i)+", ");
		}
		
		System.out.println("\n******************************");
		v.setElementAt("java", 2);//3번째 위치에 java 문자열 추가
		enu  = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
		
		System.out.println("\n******************************");
		v.trimToSize(); //할당된 메모리 만큼 크기를 줄여라
		System.out.println("size : " + v.size() + ", capacity : " + v.capacity());
//		System.out.println(v);

		
		v.setSize(2);//크기를 강제로 2로 조정한경우
		enu  = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+", ");
		}
		System.out.println("\nsize : " + v.size() + ", capacity : " + v.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
