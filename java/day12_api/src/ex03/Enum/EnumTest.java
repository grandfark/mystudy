package ex03.Enum;

enum Day {//사용자 자료형
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}

public class EnumTest {
	  Day day;  //인스턴스 생성
	    
	    public EnumTest(Day day) {  
	        this.day = day;
	    }
	    
	    public void tellItLikeItIs() {  //사용자 함수 생성
	        switch (day) {
	            case MONDAY:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case FRIDAY:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case SATURDAY: case SUNDAY:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	    
	    public static void main(String[] args) {
	        EnumTest firstDay = new EnumTest(Day.MONDAY);
	        firstDay.tellItLikeItIs();
	        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
	        thirdDay.tellItLikeItIs();
	        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
	        fifthDay.tellItLikeItIs();
	        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
	        sixthDay.tellItLikeItIs();
	        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
	        seventhDay.tellItLikeItIs();
	 	       
	    }   
}