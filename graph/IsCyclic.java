package graph;
import java.io.*;
import java.util.*;

public class IsCyclic {
	static class Edge {
		int src;
		int nbr;

		Edge(int src, int nbr) {
			this.src = src;
			this.nbr = nbr;
		}
	}

	static boolean isCyclic(ArrayList<Edge>[] graph, int src, boolean[] visited) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(src);
		while (!qu.isEmpty()) {
			int peek = qu.remove();
			if (visited[peek]) {
				return true;
			}

			visited[peek] = true;
			for (Edge e : graph[peek]) {
				if (!visited[e.nbr])
					qu.add(e.nbr);
			}
		}

		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int vtces = Integer.parseInt(br.readLine());
		ArrayList<Edge>[] graph = new ArrayList[vtces];
		for (int i = 0; i < vtces; i++) {
			graph[i] = new ArrayList<>();
		}

		int edges = Integer.parseInt(br.readLine());
		for (int i = 0; i < edges; i++) {
			String[] parts = br.readLine().split(" ");
			int v1 = Integer.parseInt(parts[0]);
			int v2 = Integer.parseInt(parts[1]);
			int wt = Integer.parseInt(parts[2]);
			graph[v1].add(new Edge(v1, v2));
			graph[v2].add(new Edge(v2, v1));
		}

		boolean[] visited = new boolean[vtces];
		for (int i = 0; i < vtces; i++) {
			if (!visited[i]) {
				if (isCyclic(graph, i, visited)) {
					System.out.println(true);
					return;
				}
			}
		}

		System.out.println(false);
	}
}
