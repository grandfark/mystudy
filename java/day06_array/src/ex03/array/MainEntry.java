package ex03.array;

public class MainEntry {

	public static void main(String[] args) {
		/*
		 * //1. int [][] a = new int [2][3];//행크기 ,열크기 a[0][0] = 1; a[0][1] = 2; a[0][2]
		 * = 3; a[1][0] = 4; a[1][1] = 5; a[1][1] = 6; //2. int[][] a2 = new int[][] {
		 * {1,2,3},{4,5,6} };//자바는 초기값을 이렇게 넣어도 된다
		 * 
		 * //3. int[][] a3 = { {1,2,3},{4,5,6} }; //초기화
		 * 
		 * //배열값 출력
		 * 
		 * System.out.println("a3[0][2]="+a3[0][2]);
		 * System.out.println("a3[1][1]="+a3[1][1]);
		 * System.out.println("+++++++++++++++++++++++++++");
		 * 
		 * for (int i = 0; i< 2; i ++) {//행크기
		 * 
		 * for(int j =0 ; j <3; j++) {//열크기 System.out.print(a3[i][j]+" "); }//j end
		 * System.out.println(); }//i end
		 * System.out.println("++++++++++++++++++++++++");
		 * System.out.println("배열의 행크기 : "+a3.length);//2
		 * System.out.println("배열의 열크기 : "+a3[0].length);//3
		 * 
		 * for (int i = 0; i< a3.length; i ++) {//행크기
		 * 
		 * for(int j =0 ; j <a3[i].length; j++) {//열크기
		 * 
		 * System.out.print(a3[i][j]+" ");
		 * 
		 * } System.out.println(); }
		 */
		int[][] qz = { { 3, 8, 5, 10 }, { 7, 1, 2, 3 }, { 0, 0, 0, 0 } };

		for (int i = 0; i < qz[0].length; i++) {// 행크기
			qz[2][i] = qz[1][i] + qz[0][i];
		} // for end

		for (int i = 0; i < qz.length; i++) {// 열 크기
			for (int j = 0; j < qz[0].length; j++) {
				System.out.print(qz[i][j] + " \t");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("****************");

		int[][] qz2 = { { 1, 2, 0 }, { 5, 7, 0 } };
		// 변동값 qz2[i][2]
		for (int i = 0; i < qz2[0].length - 1; i++) {
			qz2[i][2] = qz2[i][0] * qz2[i][1];
		} // 행

		for (int i = 0; i < qz2.length; i++) {
			for (int j = 0; j < qz2[0].length; j++)
				System.out.print(qz2[i][j] + " \t");
			System.out.println();
		}
	}// j end
}
