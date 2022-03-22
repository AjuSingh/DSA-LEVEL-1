package Sorting;
import java.util.*;
public class targetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ts(arr,target);
        //we have to find pairs with sum equal to the target
        //we will apply this algorithm only when there is no duplicates in array
    }

    static void ts(int[] arr,int target){
        Arrays.sort(arr);
        int s=0,e=arr.length-1;
        while(s<e){
            if(arr[s]+arr[e]==target){
                System.out.println(arr[s] +  " , "+  arr[e]);
                s++;
                e--;
            }else if(arr[s]+arr[e]<target){
                s++;
            }else{
                e--;
            }
        }
        return;
    }
}
