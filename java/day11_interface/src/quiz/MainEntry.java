package quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] tr = new Trans[4];
		
		tr[0] = new Bus();
		tr[1] = new Bicycle();
		tr[2] = new Plane();
		tr[3] = new Subway();
		
		String []name = {"버스","자전거","비행기","지하철"};
	
		for(int i =0 ; i < tr.length; i++) {
			tr[i].Start(name[i]); 	
			tr[i].Stop(name[i]); 
			System.out.println("****************************");
		}	
	}
}
