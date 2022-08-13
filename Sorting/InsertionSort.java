package Sorting;
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting" + Arrays.toString(arr));
        sc.close();
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                //here we will begin from end to start maintain the sort order
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j-1, j);
                } else {
                    //if already sorted then we don't need to traverse further
                    break;
                }
            }
        }
    }
    
//    3,12,3,7,4
//    3,12,3,7,4
//    3,3,12,7,4
//    3,3,7,12,4
//    3,3,4,7,12

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
