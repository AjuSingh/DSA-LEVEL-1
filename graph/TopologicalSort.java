package graph;

import java.util.*;

public class TopologicalSort {

//topo logical sort is defined as the permuation of the vertices such that for every edge uv the u must be present
//before the v in that permutation

//graph must be acyclic and directed || it is applicable on DAG
	static class Edge {
		int v1;
		int v2;

		Edge(int v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}

	}

	static void explore(int src, ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> stack) {
		visited[src] = true;
		for (Edge e : graph[src]) {
			if (!visited[e.v2]) {
				explore(e.v2, graph, visited, stack);
			}
		}
		
		//why we are adding in post order
		//because we need that the last traversed will come at last so in stack it will the enter at first position
		stack.push(src);
	}

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
			graph[v1].add(new Edge(v1, v2));
		}
		boolean[] visited = new boolean[vertices];

	}
}
