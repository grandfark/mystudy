package ex03.Enum;

enum Operation {//이텔릭체로 글씨가 누워있으면 static 이
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double calculate(double x, double y) {//함수 자료형으로 생각하면 된다.
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
}

public class EnumTest2 {
	 public static void main(String[] args) {

	        double result = Operation.PLUS.calculate(1, 2);
	        System.out.println(result); //3.0
	    }

}
