package DynamicProgramming;

import java.util.*;

public class lcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str1 = sc.next();
        int y = sc.nextInt();
        String str2 = sc.next();
        System.out.println(Tabulation(x, y, str1, str2));
    }

    static int Lcs(int x, int y, String str1, String str2) {
        if (x == 0 || y == 0)
            return 0;

        if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
            return 1 + Lcs(x - 1, y - 1, str1, str2);
        } else {
            return Math.max(Lcs(x - 1, y, str1, str2), Lcs(x, y - 1, str1, str2));
        }
    }

    static int MemoLcs(int x, int y, String str1, String str2, int[][] dp) {
        if (x == 0 || y == 0) {
            return dp[x][y] = 0;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
            return dp[x][y] = 1 + MemoLcs(x - 1, y - 1, str1, str2, dp);
        } else {
            return dp[x][y] = Math.max(MemoLcs(x - 1, y, str1, str2, dp), MemoLcs(x, y - 1, str1, str2, dp));
        }
     }


     static int Tabulation(int x, int y, String str1, String str2){
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
         return dp[x][y];
     }
}
