package Sorting;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting" + Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Array after sorting" + Arrays.toString(arr));
        sc.close();
    }

    static void cyclicSort(int[] arr){
        int n = arr.length;
        // for(int i = 0; i < n; i++) {
        //     while(i!=arr[i]-1){
        //         swap(arr,i,arr[i]-1);
        //     }
        // }

        int i=0;
        while(i<n) {
            if(i!=arr[i]-1){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
