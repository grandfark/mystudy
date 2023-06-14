package ex03.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		//set 과 list의 장점만 섞다
		Map map = new HashMap();
		map.put("kosa", "1234");
		map.put("Daebo", "1004");
		map.put("park", "7895");
		map.put("kosa", "1234");//동일한 내용이라면 후순위 삽입자료가 기존 자료를 덮어쓰며 존재하게 된다.
		
		System.out.println("요소 개수 : "+map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해 주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pwd : ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id) ){
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if( !map.get(id).equals(pwd)){
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
				System.out.println("id와 pwd 가 일치합니다.");
				break;
				}
			}
		}//while end
	}
}
