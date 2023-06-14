package ex01collection.set;

import java.util.HashSet;
import java.util.Iterator;

//Set은 순서가 없고 중복을 허용하지 않는다.
public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("볼펜");
		hs.add("컵");
		hs.add("키보드");
		
		System.out.println("요소 갯수 : "+hs.size());//5개 입력 4개 출력 중복 불허
		System.out.println(hs);//순서대로 출력안됨
		
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(14562);	
		hs2.add(1005);
		hs2.add(9885);
//		hs2.add("string");
		
		HashSet hs3 = new HashSet<>();//타입을 제한하지 않으면 모든 데이터를 받을 수 있다.
		hs3.add(10.0);
		hs3.add(14562);	
		hs3.add(1005);
		hs3.add(9885);
		hs3.add("string");
		
		Iterator it = hs.iterator();//출력한다.
		while( it.hasNext()){//시작은 while로 담는다. 추상메서드 hasNext사용
			System.out.println(it.next());
		}
		System.out.println("*************************************************");
		it = hs3.iterator();
		while( it.hasNext()){
			System.out.println(it.next());
		}
	}
}
