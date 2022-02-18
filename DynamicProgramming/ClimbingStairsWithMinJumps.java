package DynamicProgramming;
import java.util.*;
public class ClimbingStairsWithMinJumps {
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        int[] dp = new int[n+1];
	        int min = csmj(arr,0,dp);
	        if(min!=Integer.MAX_VALUE && min!=Integer.MAX_VALUE-1){
	            System.out.println(min);
	        }else{
	            System.out.println("null");
	        }
	    }
	 
	   static int tabu(int[] arr,int[] dp){
		   int n = arr.length;
		   for(int i=n-1;i>=0;i--){
			   int min = Integer.MAX_VALUE-1;
			   for(int j=1;j<=arr[i];j++){
				   int temp = i+j>n ? Integer.MAX_VALUE-1 : dp[i+j];
				   min = min<temp ? min : temp;
			   }
			   dp[i] = 1+min;
		   }
		   return dp[0];
	   }

	    static int csmj(int []a,int src,int[] dp){
	     
	     if(src>=a.length){
	         return Integer.MAX_VALUE-1;
	     }
	     
	     
	     if(src==a.length-1){
	         return 0;
	     }   
	     
	     if(dp[src]!=0){
	         return dp[src];
	     }

	        int count=Integer.MAX_VALUE-1;
	        for(int i=1;i<=a[src];i++){
	            count = Math.min( count , csmj(a,src+i,dp)+1 );
	        }
	        
	        dp[src] = count;
	        
	        return count;
	}
}
