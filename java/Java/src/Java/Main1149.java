package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1149 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] way = new int[N][3];// 거리
		int[] cost = new int[N];// 집값 총합

		for (int y = 0; y < N; y++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int x = 0; x < 3; x++) {
				int C = Integer.parseInt(st.nextToken());
				way[y][x] = C;
			}
		} // 거리 생성
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= 3; j++) {
				way[N][0] = Math.min(way[N - 1][1], way[N - 1][2]);
				way[N][1] = Math.min(way[N - 1][0], way[N - 1][2]);
				way[N][2] = Math.min(way[N - 1][0], way[N - 1][1]);
				// 위아래 바로 붙어있는 값을 비교하지 않음
				cost[j] = Math.min(Math.min(way[N][0],way[N][1]),way[N][2]);//R,G,B값중 최소값구하기
				cost[N] += cost[j];// cost의 총값
			}
		}
		System.out.println(cost);
	}
}
