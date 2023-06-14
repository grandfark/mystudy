package ex05.list;
import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		
		list.addFirst("a");	//앞에 추가
		list.addLast("z");	//뒤에 추가
		
		System.out.println(list);
		list.remove("k");//데이터 값으로 찾아서 삭제
		System.out.println(list);
		list.remove(2);//인덱스 번호로 찾아서 삭제
		System.out.println(list);
		list.removeFirst();	//배열 맨 앞
		System.out.println(list);
		list.removeLast();	//배열 맨 뒤
		System.out.println(list);
		list.set(2,"a");	//교체, 변경
		System.out.println(list);
		list.set(3,list.get(1)+"change");//
		System.out.println(list);
		String str1 = (String)list.peek();
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll();//큐에서 데이터를 꺼내온다.
		System.out.println(str2);
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove();
		System.out.println(str3);
		System.out.println(list);
	}
}
