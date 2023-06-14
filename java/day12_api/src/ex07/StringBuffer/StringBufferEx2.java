package ex07.StringBuffer;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");//문자열 추가 뒤로 추가 된다.
		System.out.println(sb);
		sb.insert(7, " my");	//문자열 삽입 원하는 위치에 삽입이 가능하다.
		System.out.println(sb);
		
//		System.out.println(sb.reverse());
//		sb.reverse();
		
		System.out.println("************************");
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.setLength(20); //잘린뒤에 늘려도 이후 문자열은 출력되지 않는다.
		System.out.println(sb);
		
	}
}
