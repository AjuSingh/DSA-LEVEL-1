package TwoDimensionArray;

import java.util.*;

public class SpiralPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] arr = new int[n][m];
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            arr[i][j]  = sc.nextInt();
	        }
	    }
	    
	    int rowS=0,colS=0;
	    int rowE=n-1,colE=m-1;
	    int tot = n*m;
	    int cnt=0;
	    
	    while(cnt!=tot) {
	    	//left row
	    	for(int i=rowS;i<=rowE && cnt<tot;i++) {
	    		System.out.println(arr[i][colS]);
	    		cnt++;
	    	}
	    	
	    	colS++;
	    	for(int j=colS;j<=colE && cnt<tot;j++) {
	    		System.out.println(arr[rowE][j]);
	    		cnt++;
	    	}
	    	rowE--;
	    	for(int i=rowE;i>=rowS && cnt<tot;i--) {
	    		System.out.println(arr[i][colE]);
	    		cnt++;
	    	}
	    	
	    	colE--;
	    	
	    	for(int j=colE;j>=colS && cnt<tot;j--) {
	    		System.out.println(arr[rowS][j]);
	    		cnt++;
	    	}
	    	rowS++;
	    }
	}
}
