package DynamicProgramming;
import java.util.*;
public class InsertionAndDeletionToMakeAToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String s1 = sc.next();
    int y = sc.nextInt();
    String s2 = sc.next();
    System.out.println(minOperations(x, y, s1, s2));
    }

    static int minOperations(int x, int y, String str1, String str2){
        int[][] dp = new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return x+y-2*dp[x][y];
    }
}
