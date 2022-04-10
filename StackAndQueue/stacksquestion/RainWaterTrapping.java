package StackAndQueue.stacksquestion;
import java.util.*;
public class RainWaterTrapping {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] gol = new int[n];
        int[] gor = new int[n];
        gol[0] = height[0];
        gor[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            gol[i] = Math.max(gol[i-1],height[i]);
        }
         
        for(int i=n-2;i>=0;i--){
            gor[i] = Math.max(gor[i+1],height[i]);
        }
            
        int wt=0;
        for(int i=0;i<n;i++){
            wt+= Math.min(gol[i],gor[i]) - height[i];
        }
        return wt;
        }
}
