package Sorting;

import java.util.*;

public class FirstPositiveMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static int getMissing(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] > 0 && arr[i] <= n && arr[i] - 1 != i && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] - 1 != i) {
                return i + 1;
            }
        }
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
