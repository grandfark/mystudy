package quiz;
//문제] 이름, 주소, 연락처를 입력받아 출력한다.
import java.util.Scanner;
public class QuizEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 주소 연락처를 입력하시오");
		String name = sc.nextLine();
		String addr = sc.nextLine();
		String tel = sc.nextLine();
		System.out.println("입력한 사항 \n 이름 : "+ name + "\n 주소 : " + addr + "\n 연락처 : " +tel);
		
	}
}
