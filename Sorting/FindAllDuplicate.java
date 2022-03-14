package Sorting;
import java.util.*;
public class FindAllDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDup(arr));
        sc.close();
    }

    static List<Integer> findDup(int[] arr){
        int n = arr.length;
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<n){
            if(arr[i]-1!=i && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }

        for(int j=0;j< n; j++){
            if(arr[j]-1!=j){
                list.add(arr[j]);
            }
        }

        return list;
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }   
}
