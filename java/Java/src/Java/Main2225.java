package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main2225 {
	public static class pair {
		int x, y;
		public pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// 세로
		int m = Integer.parseInt(st.nextToken());// 가로

		int[][] map = new int[m][n];
		for (int x = 0; x < n; x++) {// 세로
			st = new StringTokenizer(br.readLine());
			for (int y = 0; y < m; y++) {// 가로
				map[x][y] = Integer.parseInt(st.nextToken());
			}
		}
	}

	public static void bfs(int x, int y) {
		Queue<pair> qu = new LinkedList<>();
		qu.add(new pair(x, y));

	}
}
