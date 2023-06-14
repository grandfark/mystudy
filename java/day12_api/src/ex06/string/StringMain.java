package ex06.string;

public class StringMain {
	public static void main(String[] args) {
		int x = 3, y = 5;
		System.out.println("x = "+x+", y = "+y);
		x=y;
		System.out.println("x = "+x+", y = "+y);
		
		String str1 = "korea";
		String str2 = "japan";
		System.out.println("str1 = "+str1+", str2 = "+str2);
		System.out.println("hashcode : "+str1.hashCode()+",\t"+str2.hashCode());
		
		str1 = str2;
		System.out.println("str1 = "+str1+", str2 = "+str2);
		System.out.println("hashcode : "+str1.hashCode()+",\t"+str2.hashCode());
		
		str2 = "seoul";//보호차원에서 seoul이 새로운 주소값으로 들어가고 그주소는 stack영역의 str2 로 간다.
		System.out.println("str1 = "+str1+", str2 = "+str2);
		System.out.println("hashcode : "+str1.hashCode()+",\t str1값보호목적 새 주소:"+str2.hashCode());
			//이런 일을 막기위해 String Buffer, String Builder 이런게있다.
		
		String str3 = "korea";
		System.out.println("str2 = "+str2+", str3 = "+str3);
		System.out.println("hashcode : "+str2.hashCode()+",\t "+str3.hashCode());
	
		str3 = "park";
		System.out.println("hashcode : "+str2.hashCode()+",\t "+str3.hashCode());
		System.out.println("str2 = "+str2+", str3 = "+str3);
		
		str1 = "park";
		System.out.println("hashcode : "+str1.hashCode()+",\t "+str3.hashCode());
		
	}
}
