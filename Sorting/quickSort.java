package Sorting;
import java.util.*;
public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        quSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void quSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }

        //find the exact position of the element return it
        int p = part(arr,s,e);
        quSort(arr, s, p-1);
        quSort(arr,p+1,e);
    }

    static int partition(int[] arr,int s,int e){
        int pivot = arr[s];
        int cnt = 0;
        //finding the exact position of the element 
        for(int i=s+1;i<=e;i++){
            if(arr[i]<= pivot){
                cnt++;
            }
        }
        //exact position of the pivot
        int ind = s + cnt;
        swap(arr, s, ind);

        while(s<ind && e>ind){
            //we will increase the index untill we get the largest element on left side
            while(arr[s]<=pivot){
                s++;
            }
            
            //we will decreased  the index untill we get the smallest element on right side 
            while(arr[e]>pivot){
                e--;
            }
            //swapping the element on left and element on right;
            if(s<ind && e>ind){
                swap(arr,s,e);
                s++;
                e--;
            }
        }

        return ind;
    }

    static int part(int[] arr,int s,int e){
        int pi=s;
        int pivot = arr[e];

        //we will increse untill we get smallest element and swap it with larger element
        for(int i=s;i<e;i++){
            if(arr[i]<=pivot){
                swap(arr,i,pi);
                pi++;
            }
        }
        swap(arr,e,pi);
        return pi;
    }

    static void swap(int[] arr,int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
