package DynamicProgramming;

import java.util.*;

public class ShortestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s1 = sc.next();
        int y = sc.nextInt();
        String s2 = sc.next();
        System.out.println(scc(x, y, s1, s2));
        sc.close();
    }

    static int lcs(int x,int y, String str1, String str2){
        int[][] dp = new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }

    static int scc(int x, int y, String str1, String str2){
        int dp[][] = new int[x+1][y+1];
        for(int i=1;i<=x;i++){
            dp[i][0] = i;
        }

        for(int i=1;i<=y;i++){
            dp[0][i] = i;
        }

        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
                }
            }
        }

        return dp[x][y];
    }

}
