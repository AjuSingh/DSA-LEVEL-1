package graph;
import java.util.*;

public class DijkstraAlgorithm {
	static class Edge{
		int v1;
		int v2;
		int wt;
		
		Edge(int v1,int v2,int wt){
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}
		
	}
	
	static class Pair implements Comparable<Pair>{
		int vtx;
		String path;
		int wsf;
		
		
		Pair(int vtx,String path,int wsf){
			this.vtx=vtx;
			this.path = path;
			this.wsf = wsf;
		}
		
		public int compareTo(Pair other) {
			return this.wsf - other.wsf;
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
			graph[v1].add(new Edge(v1, v2,wt));
			graph[v2].add(new Edge(v2, v1,wt));
		}
		
		int src = sc.nextInt();
		boolean[] visited = new boolean[vertices];
		PriorityQueue<Pair> qu = new PriorityQueue<>();
		qu.add(new Pair(src,src+"",0));
		while(!qu.isEmpty()) {
			Pair peek = qu.remove();
			if(visited[peek.vtx]) continue;
			visited[peek.vtx] = true;
			System.out.println(peek.vtx + "@" + peek.path + " " + peek.wsf);
			for(Edge e:graph[peek.vtx]) {
				if(!visited[e.v2]) {
					qu.add(new Pair(e.v2,peek.path + "" + e.v2,peek.wsf+e.wt));
				}
			}
		}
	}
}
