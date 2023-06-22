package Java;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversal {
	private static void dfs(List<Integer>[] graph, int node, boolean[] visited) {
		if (visited[node])
			return;

		visited[node] = true;
		System.out.print(node + " ");

		for (int neighbor : graph[node])
			dfs(graph, neighbor, visited);
	}

	public static void main(String[] args) {
		int numNodes = 7;
		List<Integer>[] graph = new ArrayList[numNodes];
		for (int i = 0; i < numNodes; i++)
			graph[i] = new ArrayList<>();

		graph[0].add(1);
		graph[0].add(2);
		graph[1].add(3);
		graph[1].add(4);
		graph[2].add(5);
		graph[2].add(6);
		
		boolean[] visited = new boolean[numNodes];
		dfs(graph, 0, visited);
	}
}
