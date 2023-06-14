package ex01_generic;

public class GenericEx<T> {

	T[] v;//타입 미결정

	public void set(T[] v) {//멤버함수
		this.v = v;
	}
	
	public void print() {
		for(T item : v) {
			System.out.println(item);
		}
	}
}
