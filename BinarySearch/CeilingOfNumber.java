package BinarySearch;
import java.util.*;
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(ceil(arr,x));
        sc.close();
    }

    static int ceil(int[] arr,int x){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]<x){
                s=mid+1;
            }else if(arr[mid]>x){
                e = mid-1;
            }else{
                return mid;
            }
        }
        return arr[s];
    }
}
