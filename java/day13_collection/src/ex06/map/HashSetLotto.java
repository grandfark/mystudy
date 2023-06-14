package ex06.map;
import java.util.*;
class HashSetLotto{
	public static void main(String[] args) 	{
		Set set = new TreeSet();//Set 정렬에 중복 제거까지
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}
	//	List list = new LinkedList(set);	// LinkedList(Collection c)
	//	Collections.sort(list);		// Collections.sort(List list) treeSet이 아니라면 sort로 정렬해야한다.
		System.out.println(set);
	}
}