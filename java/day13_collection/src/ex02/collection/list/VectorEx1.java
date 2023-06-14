package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("length / capacity");
		System.out.println(v.size()+"      /        "+v.capacity());

		Vector<Integer>v2 = new Vector<>(3,4);// 초기용량, 증가용량 초기용량이 가득차면 증가용량분 만큼 늘린다.
		v2.add(1);	v2.add(20);		v2.add(35);
		v2.add(104);v2.add(5);		v2.add(6);
		v2.add(7);	v2.add(8);		v2.add(8);
		v2.add(200);v2.add(204);	v2.add(90);
		int len = v2.size();
		
		System.out.println(len+"      /        "+v2.capacity());
		System.out.println("************* Iterator() method *****************");
		Iterator it  = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("************* get() method *****************");
		for (int i = 0 ; i < v2.size() ; i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("************* sort method *****************");
		Collections.sort(v2);
		for (int i = 0 ; i < v2.size() ; i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("************* elementsAt() method *****************");
		for (int i = 0 ; i < v2.size() ; i++) {//vector에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i);//요소 객체 알아내기
			System.out.println(num);//위에서 sort 를 해서 정렬된 상태로 출력된다.
		}
		
		System.out.println("************* trimToSize() method *****************");
		v2.trimToSize();//capacity 조정하기
		System.out.println(v2.size()+"      /        "+v2.capacity());
	}
}
