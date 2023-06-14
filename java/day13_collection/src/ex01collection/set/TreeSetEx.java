package ex01collection.set;

import java.util.TreeSet;

public class TreeSetEx {//자동 정렬되어 출력한다. set의 특성도 지니고 있다.
	public static void main(String[] args) {
		TreeSet set = new TreeSet();// 타입을 지정하지 않으면 모든타입을 받는다.

		int[] score = { 85, 95, 50, 35, 45, 65, 10, 65, 100 };
		
		for(int i = 0 ;i < score.length ; i++) {
			//set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		
//		System.out.println("50보다 작은 값 : "+set.headSet(50));
		System.out.println("50보다 작은 값 : "+set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : "+set.tailSet(50));
		
	}
}
