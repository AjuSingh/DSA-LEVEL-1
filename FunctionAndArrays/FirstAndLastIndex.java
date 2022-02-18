package FunctionAndArrays;
import java.util.*;
public class FirstAndLastIndex {
public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	    int n= sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int d = sc.nextInt();
	    int fi = getFirst(arr,d);
	    int li = getLast(arr,d);
	    System.out.println(fi);
	    System.out.println(li);
	 }
	 
	 static int getFirst(int[] arr,int x){
	     int s=0;
	     int e = arr.length-1;
	     int index=-1;
	     while(s<=e){
	           int mid = s+(e-s)/2;
	         if(arr[mid]==x){
	             index = mid;
	             e = mid-1;
	         }else if(arr[mid]<x){
	             s  = mid+1;
	         }else{
	             e = mid-1;
	         }
	     }
	     return index;
	 }
	 
	 
	 static int getLast(int[] arr,int x){
	     int s=0;
	     int e = arr.length-1;
	     int index=-1;
	     while(s<=e){
	         int mid = s+(e-s)/2;
	         if(arr[mid]==x){
	             index = mid;
	             s = mid+1;
	         }else if(arr[mid]<x){
	             s  = mid+1;
	         }else{
	             e = mid-1;
	         }
	     }
	     return index;
	 }
}

