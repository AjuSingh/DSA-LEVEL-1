package Sorting;
import java.util.*;
public class quickSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        //we need to find kth smallest elment in the array
        System.out.println(quSelect(arr,0,n-1,k-1));
        sc.close();
    }

    //time complexity will be nlogn because in each iteration we are left with almost half array
    static int quSelect(int[] arr,int s,int e,int k){
            //we will find the pivot index and check if our k is at its index so return pivot index
            int pi = partition(arr,s,e);

            if(k<pi){
                return quSelect(arr,s,pi-1,k);
            }else if(k>pi){
                return quSelect(arr,pi+1,e,k);
            }else{
                return arr[pi];
            }
    }

    static int partition(int[] arr,int s,int e){
        int pivot = arr[e];
        int pi = s;
        for(int i=s;i<e;i++){
            if(arr[i]<=pivot){
                swap(arr,i,pi);
                pi++;
            }
        }
        swap(arr,pi,e);
        return pi;
    }

    
    static void swap(int[] arr,int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
