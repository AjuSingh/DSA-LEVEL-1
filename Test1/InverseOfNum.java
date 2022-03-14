package Test1;
import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int len = (int)(Math.log10(n)+1);
        int ans = 0;
        int sz = len;
        while(n>0){
            int ld = n%10;
            ans+=len*((int)(Math.pow(10,sz-ld)));
            len--;
            n/=10;
        }
        System.out.println(ans);
        //we have to traverse from left to right and place in the inverse position                  
    }
}
