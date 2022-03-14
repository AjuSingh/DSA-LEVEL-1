package DynamicProgramming;
import java.util.*;
public class LongestPalidromeSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lcs(str));
    }

    static int lcs(String str) {
        String rev = "";
        int n = str.length();
        for(int i=n-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        int[][] dp = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
