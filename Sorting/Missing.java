package Sorting;
import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(miss(arr));
        sc.close();
    }

    static int miss(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]-1!=i && arr[i]<n){
                swap(arr, arr[i]-1, i);
            }else{
                i++;
            }
        }

        for(int j=0;j<n;j++){
            if(arr[j]-1!=i){
                return i;
            }
        }

        return n;
    }


    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
