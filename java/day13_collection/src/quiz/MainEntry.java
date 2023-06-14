package quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		Person ps = new Person();
		Student stu = new Student();
		Worker work = new Worker();
		
		System.out.print("사람 정보를 입력하세요. 1: 회사원, 2: 학생");
		int info = sc.nextInt();
		switch(info) {
		case 1: 
		System.out.println("회사원을 선택하셨습니다.");
		System.out.println("이름을 입력하세요.");
		work.name=sc.nextLine();
		System.out.println("나이를 입력하세요.");
		work.age=sc.nextLine();
		System.out.println("성별을 입력하세요.");
		work.gender=sc.nextLine();
		System.out.println("사번을 입력하세요.");
		work.num=sc.nextLine();
		System.out.println("직급을 입력하세요.");
		break;
		case 2: 
		System.out.println("학생을 선택하셨습니다.");
		System.out.println("이름을 입력하세요.");
		stu.name=sc.nextLine();
		System.out.println("나이를 입력하세요.");
		stu.age=sc.nextLine();
		System.out.println("성별을 입력하세요.");
		stu.gender=sc.nextLine();
		System.out.println("사번을 입력하세요.");
		stu.num=sc.nextLine();
		System.out.println("직급을 입력하세요.");
		break;
		}
		
		
		
		
		System.out.println("학생이름 : "+stu.name+", 나이 : "+stu.age+", 성별 : "+stu.gender+", 학년 : "+stu.num+", 듣는 강의 : "+stu.study);
		System.out.println("직원이름 : "+work.name+", 직원 나이 : "+work.age+", 성별 : "+work.gender+", 사번 : "+work.num+", 직급 : "+work.rank);
	}
}
