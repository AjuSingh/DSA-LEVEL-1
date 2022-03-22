package Sorting;
import java.util.*;
public class sortDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        sc.close();
        sortdate(arr);
    }


    static void sortdate(String[] arr){
        //sort on the basis of the day
        count(arr,100000,1,32);
        //sort on the basis of the month
        count(arr,10000,100,13);
        //sort on the basis of the year
        count(arr,1,10000,2501);
    }

    static void count(String[] arr,int div,int mod,int range){
        int[] cnt = new int[range];
        for(String str:arr){
            int num = Integer.parseInt(str);
            int rem = num/div;
            int digit = rem%mod;
            cnt[digit]++;
        }

        //prefix array 
        for(int i=1;i<range;i++){
            cnt[i]+=cnt[i-1];
        }

        String[] temp = new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int num = Integer.parseInt(arr[i]);
            int rem = num/div;
            int digit = rem%mod;
            int pos = cnt[digit]-1;
            temp[pos] = arr[i];
            cnt[digit]--;
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(temp));
        return;
    }
}
