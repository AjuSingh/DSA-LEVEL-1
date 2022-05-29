package graph;

import java.util.*;

public class IsConnected {
	static class Edge {
		int v1;
		int v2;
		int wt;

		Edge(int v1, int v2, int wt) {
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}

	}

	static void getComp(ArrayList<Edge>[] graph, int src, boolean[] visited) {
		visited[src] = true;

		for (Edge cur : graph[src]) {
			if (!visited[cur.v2]) {
				getComp(graph, cur.v2, visited);
			}
		}
	}
   //if graph is connected then it visit all the vertices if not then it is not connected graph
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
	
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		for (int i = 0; i < vertices; i++) {
			graph[i] = new ArrayList<>();
		}

		int edges = sc.nextInt();
		for (int i = 0; i < edges; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int wt = sc.nextInt();
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}
		boolean[] visited = new boolean[vertices];
		getComp(graph, 0, visited);
		for (boolean val : visited) {
			if (!val)
				System.out.println(false);
			return;
		}

		System.out.println(true);
	}

}
