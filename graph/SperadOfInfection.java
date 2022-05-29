package graph;
import java.util.*;

public class SperadOfInfection {
	static class Edge{
		int v1;
		int v2;
		
		Edge(int v1,int v2){
			this.v1 = v1;
			this.v2 = v2;
		}
		
	}
	
	static class Pair{
		int vtx;
		int time;
		
		Pair(int vtx,int time){
			this.vtx=vtx;
			this.time = time;
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
		int t = sc.nextInt();
		boolean[] visited = new boolean[vertices];
		Queue<Pair> qu = new LinkedList<>();
		qu.add(new Pair(src,1));
		while(!qu.isEmpty()) {
			Pair peek = qu.remove();
			if(peek.time > t) break;
			if(visited[peek.vtx]) continue;
			visited[peek.vtx] = true;
			for(Edge e:graph[peek.vtx]) {
				if(!visited[e.v2]) {
					qu.add(new Pair(e.v2,peek.time+1));
				}
			}
		}
	}
}
