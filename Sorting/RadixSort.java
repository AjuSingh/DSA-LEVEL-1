package Sorting;
import java.util.*;
public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        
        int place = 1;
        while(max/place>0){
            count(arr,place);
            place*=10;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void count(int[] arr,int place){
        //place represent the which elment need to pick up from the number
        int[] cnt=  new int[10];
        for(int i=0;i<arr.length;i++){
            int rem = arr[i]/place;
            int digit = rem%10;
            cnt[digit]++;
        
        }

        //prefix array to sort
        for(int i=1;i<10;i++){
            cnt[i]+=cnt[i-1];
        }
        //now traverse from the end to fill the sorted array
        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int rem = arr[i]/place;
            int digit = rem%10;
            //placing the digit on its place on the basis of place
            int pos=cnt[digit]-1;
            ans[pos] = arr[i];
            //decrease the index of the digit
            cnt[digit]--;
        }
        System.out.println(Arrays.toString(ans));
        arr=ans;
        return;
    }
}
