package graph;

import java.util.*;
import java.io.*;

public class HamiltonionPathAndCycle {

	static class Edge {
		int src;
		int nbr;
		int wt;

		Edge(int src, int nbr, int wt) {
			this.src = src;
			this.nbr = nbr;
			this.wt = wt;
		}
	}

	static void printPaths(int src, ArrayList<Edge>[] graph, int cnt, String psf, boolean[] visited, int cur) {
		if (cnt == graph.length) {
			for (Edge e : graph[cur]) {
				if (e.nbr == src) {
					System.out.println(psf + "*");
					return;
				}
			}
			System.out.println(psf + ".");
			return;
		}

		visited[cur] = true;
		for (Edge e : graph[cur]) {
			if (!visited[e.nbr]) {
				printPaths(src, graph, cnt + 1, psf + "" + e.nbr, visited, e.nbr);
			}
		}
		visited[cur] = false;
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
			graph[v1].add(new Edge(v1, v2, wt));
			graph[v2].add(new Edge(v2, v1, wt));
		}

		int src = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[vtces];
		printPaths(src, graph, 1, src + "", visited, src);
	}

}
