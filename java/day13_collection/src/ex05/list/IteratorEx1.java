package ex05.list;
import java.util.*;

class IteratorEx1
{
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();//데이터 출력 역할

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	} // main
} // class