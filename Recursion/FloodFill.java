package Recursion;
import java.util.*;
public class FloodFill {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean visited[][] = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int i, int j, String asf,boolean[][] visited)
     {
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(asf);
            return;
        }

        if(i<0 || i==maze.length || j<0 || j==maze[0].length || maze[i][j]==1 || visited[i][j]==true){
            return;
        }

        visited[i][j] = true;
        //t l d r
        floodfill(maze,i-1,j,asf+"t",visited);
        floodfill(maze,i,j-1,asf+"l",visited);
        floodfill(maze,i+1,j,asf+"d",visited);
        floodfill(maze,i,j+1,asf+"r",visited);

        visited[i][j] = false;

      }
}
