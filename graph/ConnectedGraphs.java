package graph;
import java.util.*;
public class ConnectedGraphs {
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
	
	static void hasPath(ArrayList<Edge>[] list,int src,int des,boolean[] visited,String str) {
		if(src==des) {
			System.out.println(str+des);
			return;
		}
		
		visited[src]=true;
		for(Edge se:list[src]) {
			if(!visited[se.v2]) {
				hasPath(list,se.v2,des,visited,str + src);
			}
		}
		visited[src] = false;
	}
	
	static void getComp(ArrayList<Edge>[] graph,int src,boolean[] visited,ArrayList<Integer> comp) {
		visited[src] = true;
		comp.add(src);
		
		for(Edge cur:graph[src]) {
			if(!visited[cur.v2]) {
				getComp(graph, cur.v2, visited, comp);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
        //now we dont know how many edges are connected with the one vertex so use array list to represent the 
		//edges connected with vertex with array list
		
		//we know at starting no of vertices so use the array of arraylist of type edge
		@SuppressWarnings("unchecked")
		ArrayList<Edge>[] graph = new ArrayList[vertices];
		for(int i=0;i<vertices;i++) {
			graph[i] = new ArrayList<>();
		}
		
		int edges = sc.nextInt();
		for(int i=0;i<edges;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int wt = sc.nextInt();
			graph[v1].add(new Edge(v1,v2,wt));
			graph[v2].add(new Edge(v2,v1,wt));
		}
		ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
		boolean[] visited = new boolean[vertices];
		for(int i=0;i<vertices;i++) {
			if(!visited[i]) {
				ArrayList<Integer> comp = new ArrayList<>();
				getComp(graph, i, visited, comp);
				comps.add(comp);
			}
		}
	    
		
	}
}
