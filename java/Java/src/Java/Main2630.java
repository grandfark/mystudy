package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630 {
	int mid;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[][] paper = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int C = Integer.parseInt(st.nextToken());
				paper[i][j] = C;
				if (paper[i][j] == 1) {
				}
			}
		}
	}
	class dfs{
		if(visit[node]) return;
		visit[node] = true;
		for(int neighbor : graph[node] ) {
			dfs(graph, neighbor, visit);
		}
		private dfs (List<Integer>[] graph, int node, boolean[]visit) {
			List<Integer>[]graph = new ArrayList[node];
		}
	}
}
