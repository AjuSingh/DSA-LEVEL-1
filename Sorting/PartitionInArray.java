package Sorting;

import java.util.*;

public class PartitionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // int pivot = sc.nextInt();
        //we have to place all small elements at left of pivot and all greater at the right of pivot.
        //we are using the algorithm used in quickSort
        // partition(arr,pivot);
        partitionInOnePass(arr, 0,n-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void partition(int[] arr,int pivot){
        int n = arr.length;
        int s=0,e= n - 1;
        int cnt=0,pi=0;
        for(int i=0;i<n;i++){
            if(arr[i]<= pivot){
                cnt++;
            }

            if(arr[i]==pivot){
                pi = i;
            }
        }

        int pivotInd = cnt-1;
        swap(arr,pi,pivotInd);
        while(s<pivotInd && e>pivotInd){
            while(arr[s]<= pivot){
                s++;
            }

            while(arr[e]>pivot){
                e--;
            }

            if(s<pivotInd && e>pivotInd){
                swap(arr,s,e);
                s++;
                e--;
            }

        }
    }

    static int partitionInOnePass(int[] arr,int s,int e){
        int pi = s;
        int pivot = arr[e];
        for(int i=0;i<e;i++){
            if(arr[i]<=pivot){
                swap(arr,pi,i);
                pi++;
            }
        }
        swap(arr,pi,e);
        return pi;
    }

  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
