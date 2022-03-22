package BinarySearch;
import java.util.*;
public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //floor is that which is largest number which is smaller than target
        int target = sc.nextInt();
        sc.close();
    }

    static int floor(int[] arr,int x){
        int n = arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid =s + (e-s)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return e;
    }
}
