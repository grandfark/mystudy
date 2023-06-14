package ex02.oop;

class Point extends Object{//자동으로 Object class를 상속받고 있었다.
	private int x , y;	//멤버 변수 - 접근 지정자: private , default , protected ,public 공개범위 순으로 확장된다
						//int 는 0으로 double는 0.0으로 String 은 null을 기본으로 변수를 초기화 한다.
						//접근 지정자: 미지정 시 디폴트 기본값 설정, 공개하지 않을경우 private 로 한다.
						//멤버 함수로 호출해서 봐야한다.
	public void display(){
		System.out.println(x+", "+y);
	}
	public int getX() {
		return x; 
	}
	public void setX(int xx) { //int xx를 파라미터라고 부른다(매개변수)
		this.x = x;
	}
}//Point end

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println(pt.getX());//접근 하려면 멤버 지정자로 봐라
//		System.out.println();
		pt.setX(1000);
		System.out.println(pt.getX());
		//모든 클래스의 최상위는 오브젝트클래스이다.
		pt.display();
//		int xx; 
//		System.out.println(xx);
	}
}//MainEntry end
