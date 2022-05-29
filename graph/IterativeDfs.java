package graph;
import java.util.*;

public class IterativeDfs {
	static class Edge {
		int v1;
		int v2;

		Edge(int v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}

	}

	static class Pair {
		int vtx;
		String path;

		Pair(int vtx, String path) {
			this.vtx = vtx;
			this.path = path;
		}
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
			int wt = sc.nextInt();
			graph[v1].add(new Edge(v1, v2));
			graph[v2].add(new Edge(v2, v1));
		}

		int src = sc.nextInt();
		boolean[] visited = new boolean[vertices];
		Stack<Pair> qu = new Stack<>();
		qu.add(new Pair(src, src + ""));
		while (!qu.isEmpty()) {
			Pair peek = qu.pop();
			if (visited[peek.vtx])
				continue;
			visited[peek.vtx] = true;
			System.out.println(peek.vtx + "@" + peek.path);
			for (Edge e : graph[peek.vtx]) {
				if (!visited[e.v2]) {
					qu.add(new Pair(e.v2, peek.path + "" +  e.v2));
				}
			}
		}
	}
}
