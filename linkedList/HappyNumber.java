package linkedList;
import java.util.*;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isHappy(n));
        // a number is happy if it returns 1 at the end of the process
        sc.close();
    }


    static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = getSum(slow);
            fast = getSum(getSum(fast));
            if(slow==1 || fast==1) return true;
        }while(slow!=fast);
        return false;
    }

    static int getSum(int n){
        // 12 = 1*1 + 2*2 = 5;
        int sum = 0;
        while(n>0){
           int ld = n%10;
           sum+=ld*ld;
            n/=10;
        }
        return sum;
    }
}
