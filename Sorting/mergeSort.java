package Sorting;
import java.util.*;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        merSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void merSort(int[] arr,int s,int e){
        if(s==e){
            return; 
        }

        int mid = (s+e)/2;
        merSort(arr,s,mid);
        merSort(arr, mid+1, e);
        merge(arr, s, e);
    }

    static void merge(int[] arr,int s,int e){
    int mid = (s+e)/2;
    int i=s;
    int j=mid+1;
    int[] temp = new int[e+1];
    int k = s;
    while(i<=mid && j<=e){
        if(arr[i]<arr[j]){
            temp[k++] = arr[i++];
        }else{
            temp[k++] = arr[j++];
        }
    }


    //if some elements left over in arr1
    while(i<=mid){
        temp[k++] = arr[i++];
    }

    while(j<=e){
       temp[k++] = arr[j++];
    }

    //putting the elements back in the orignal array
    for(i=s;i<=e;i++){
        arr[i] = temp[i];
    }
    return;
    }
}
