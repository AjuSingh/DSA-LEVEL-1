package graph;
import java.util.*;

import graph.BasicImp.Edge;
public class HasPath {
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
	
	static boolean hasPath(ArrayList<Edge>[] list,int src,int des,boolean[] visited) {
		if(src==des) return true;
		
		visited[src]=true;
		for(Edge se:list[src]) {
			if(!visited[se.v2] && hasPath(list,se.v2,des,visited)) {
				return true;
			}
		}
		visited[src] = false;
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertices = sc.nextInt();
        //now we dont know how many edges are connected with the one vertex so use array list to represent the 
		//edges connected with vertex with array list
		
		//we know at starting no of vertices so use the array of arraylist of type edge
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
		
		
		int src = sc.nextInt();
		int des = sc.nextInt();
		
		
			
	}

}
