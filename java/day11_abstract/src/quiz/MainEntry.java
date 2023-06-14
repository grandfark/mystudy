package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] tr = new Trans[4];
		
		tr[0] = new Bus();
		tr[1] = new Bicycle();
		tr[2] = new Plain();
		tr[3] = new Subway();
		
		String []name = {"버스","자전거","비행기","지하철"};
	
		for(int i =0 ; i < tr.length; i++) {
			tr[i].Start(name[i]); 	
			tr[i].Stop(name[i]); 
			System.out.println("****************************");
		}
		//object[] name = { new Bicycle(), new Bus(), new Subway(), new Plain() ); 함수를 오브젝트 배열로 넣는방식도 가능하다.
	
		
	}
}
