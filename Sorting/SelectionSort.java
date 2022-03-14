package Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting"  + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting"  + Arrays.toString(arr));
        sc.close();
    }

    static void selectionSort(int[] arr){
        //in this select the smallest element and put it in the end
        int n = arr.length;
        for(int i=0;i<n;i++){
            //fixing the minimum element at the given postion
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    swap(arr, i, j);
                }
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