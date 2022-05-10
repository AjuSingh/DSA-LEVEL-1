package Sorting;
import java.util.*;
public class BuubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //at every iteration the largest element is takes its postion
        //thats why the size of array is decreased at each iteration
        //it takes n-1 iteration to sort the array because the array of size is always sorted
        //time complexity of this algorithm is O(n*n)
        //it is also known as exchange sort  and sinking sort
        System.out.println("Array before sorting"  + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting"  + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]  = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    return;
    }
}


