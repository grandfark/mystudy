package Java;

import java.util.*;
import java.io.*;
public class dfs_bfs {
	static int n, m, total;	// n 정점 개수, m 간선 개수, total 방문한 정점 수
	static boolean[] visit;
	static ArrayList<Integer>[] adj;
	static void dfs(int curr) {
		System.out.print(curr + " ");
		visit[curr] = true;
		total++;
		for (int next : adj[curr]) 
			if (!visit[next]) dfs(next);
	}
//	static void dfs(int start) {
//	Stack<Integer> st = new Stack<>();
//	st.add(start);
//	visit[start] = true;
//	
//	while (!st.isEmpty()) {
//		int curr = st.pop();
//		System.out.print(curr + " ");
//		total++;
//		for (int next : adj[curr]) {
//			if (!visit[next]) {
//				st.add(next);
//				visit[next] = true;
//			}
//		}
//	}
//}
	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true;
		
		while (!q.isEmpty()) {
			int curr = q.poll();
			System.out.print(curr + " ");
			total++;
			for (int next : adj[curr]) {
				if (!visit[next]) {
					q.add(next);
					visit[next] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		adj = new ArrayList[n + 1];
		visit = new boolean[n + 1];
		for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
		while (m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken());
			// a - b 연결
			adj[a].add(b);
			adj[b].add(a);
		}
		System.out.println("ㅇㅇㅇ");
		dfs(1);//경로 추적
//		bfs(1);//경로 추적
		System.out.println();
		System.out.println(total - 1);//노선의 묶음
	}
}
