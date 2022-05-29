package graph;
import java.io.*;
import java.util.*;

public class isBipartite {
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
   
   static class Pair{
       int vtx;
       int level;
       
       Pair(int vtx,int level){
           this.vtx=vtx;
           this.level=level;
       }
   }
   
   
   static boolean isBip(ArrayList<Edge>[] graph,int src,Integer[] visited){
       Queue<Pair> qu = new LinkedList<>();
       qu.add(new Pair(src,1));
      
       while(!qu.isEmpty()){
           Pair peek = qu.remove();
           if(visited[peek.vtx]!=null){
               if(visited[peek.vtx]!=peek.level%2) return false;
               continue;
           }
           
           visited[peek.vtx] =  peek.level%2==0 ? 0 : 1;
           for(Edge e:graph[peek.vtx]){
               if(visited[e.nbr]==null){
                   qu.add(new Pair(e.nbr,peek.level+1));
               }
           } 
       }
       return true;
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
        //null means unvisited
        //0 for that element is on even level
        //1 for that element is on odd level
        Integer[] visited = new Integer[vtces];
        for(int i=0;i<vtces;i++){
            if(visited[i]==null && !isBip(graph,i,visited)){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
   } 
}