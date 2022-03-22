package BinarySearch;
import java.util.*;

public class FirstAndLastIndex {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    System.out.println(getFirst(arr,target));
    System.out.println(getLast(arr,target));
    sc.close();
 }   

 static int getFirst(int[] arr,int x){
    int s=0;
    int e=arr.length-1;
    int index = -1;
    while(s<=e){
        int mid = s+(e-s)/2;
        if(arr[mid]==x){
            e=mid-1;
            index = mid;
        }else if(arr[mid]<x){
            s = mid+1;
        }else{
            e = mid-1;
        }
    }
    return index;
}

 static int getLast(int[] arr,int x){
    int s=0;
    int e=arr.length-1;
    int index = -1;
    while(s<=e){
        int mid = s + (e-s)/2;
        if(arr[mid]==x){
            s=mid+1;
            index = mid;
        }else if(arr[mid]<x){
            s = mid+1;
        }else{
            e = mid-1;
        }
    }
    return index;
}
}
