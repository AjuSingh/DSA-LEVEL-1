package BinarySearch;

import java.util.*;

public class SeachInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // Input: array = [1,2,3,4,5,3,1], target = 3
        // Output: 2
        // Explanation: 3 exists in the array, at index=2 and index=5. Return the
        // minimum index, which is 2.
        System.out.println(getIndex(arr, target));
        sc.close();
    }

    static int getIndex(int[] arr, int target) {
        int peak = peak(arr);
        // we know the peak element index means at this end we get the ascending order
        // array
        // then afer this there is ascending order array
       int ascIndex = binSearchAsc(arr,target,0,peak);
        if(ascIndex!=-1){
            return ascIndex;
       }else{
           return binSearchDes(arr,target,peak+1,arr.length-1);
       }
    }

    static int binSearchAsc(int[] arr, int x, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static int binSearchDes(int[] arr, int x, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    static int peak(int[] arr) {
        int n = arr.length;
        int s = 0, e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid + 1] > arr[mid]) {
                // we know if next elemet is greater than the next could be answer
                s = mid + 1;
            } else {
                // in this we dont know if the previous element is smaller or greater than that
                // why we are setting the end as mid
                e = mid;
            }
        }

        // we are returning the s or end because the loop breaks when there is only one
        // elment is left
        return s;
    }
}
