package slidingWindow;
import java.util.*;
public class BuyAndSellStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maxProfit(arr));
	}
	
	  public static int maxProfit(int[] pr) {
	        int n = pr.length;
	        int max = 0,i=0;
	        for(int j=0;j<n;j++){
	          if(pr[j]<pr[i]){
	                i=j;
	            }else{
	                max = Math.max(max,pr[j]-pr[i]);
	            }           
	        }
	          
	        return max;
	    }

}
