package quiz;

public class Main {
public static void main(String[] args) {
	
	Salse ss = new Salse("test1","엉업부","010-1111-5555",1515,1);
	ss.display();
	
	
	
	
	
	
	
}
	/*	
		//정직원 테이블
		Employee epl = new Employee(); 	
		epl.setEplnum(88);				//정직원 사번
		epl.setEplname("정직원");		//정직원 이름
		epl.setEpldepart("영업부");		//정직원 부서
		epl.setEpltel("010-1234-5678");	//정직원 연락처
		
		//시간직 테이블
		epl.setPtnum(15);				//시간직 사번
		epl.setPtname("김시간");		//시간직 이름
		epl.setPtdepart("개발부");		//시간직 부서
		epl.setPttel("010-9876-5432");	//시간직 연락처
		
		Regular r = new Regular();
		r.setEplcost(15000);			//정직원시간당 단가
		r.setPtcost(20*8);				//시간직 시간당 단가
		r.setEplworkday(20*8);			//정직원 총 근무 시간
		r.setPtworkday(8); 				//시간직 총 근무 시간

		Commission cm = new Commission();
			if( epl.ptnum < 0 || epl.eplnum > 0) {//시간직이 없는 경우
				epl.epldisplay();	//정직원만 출력
				r.display1();
			}else if(epl.eplnum < 0 || epl.ptnum > 0 ){//정직원이 없는 경우
				epl.ptdisplay();	//시간직만 출력
				r.display2();
			}else if(epl.ptnum < 0 && epl.eplnum < 0) {//시간직, 정규직 모두 없는 경우
				System.out.println("폐업하였습니다.");
			}else {epl.alldisplay(); r.display1(); r.display2();}
			
			
			
	}*/
}
