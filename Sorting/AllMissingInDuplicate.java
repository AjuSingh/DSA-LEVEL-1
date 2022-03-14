package Sorting;

import java.util.*;

public class AllMissingInDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        List<Integer> list = new ArrayList<>();

        while (i < n) {
            //one condition is for cyclicSort 
            //and other to prevent the run time error when we have to swap same number again and again
            if (arr[i] - 1 != i && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
 
        for (int j = 0; j < n; j++) {
            if (arr[j] - 1 != j) {
                list.add(j + 1);
            }
        }

        return list;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }

}
