package DynamicProgramming;
import java.util.*;
public class printLcs {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    String s1 = sc.next();
    // int y = sc.nextInt();
    String s2 = sc.next();
    printlcs(s1,s2);
}

static void printlcs(String s1,String s2){
    int n = s1.length();
    int m = s2.length();
    int[][] dp = new int[n+1][m+1];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j] = 1 + dp[i-1][j-1];
            }else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
    

    int i=n,j=m;
    String ans="";
    while(i!=0 && j!=0){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            ans = s1.charAt(i-1) + ans;
            i--;
            j--;
        }else{
            if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
    }
   System.out.println(ans);
   return;
}

static String print(int x,int y,String s1,String s2){
    String[][] dp = new String[x+1][y+1];
    for(int i=0;i<=y;i++){
        dp[0][i] = "";
    }
    
    for(int i=0;i<=x;i++){
        dp[i][0] = "";
    }

    for(int i=1;i<=x;i++){
        for(int j=1;j<=y;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]  = dp[i-1][j-1] + s1.charAt(i-1);
            }else{
                String tem1 = dp[i-1][j];
                String tem2 = dp[i][j-1];
                dp[i][j]  = dp[i-1][j].length() <= dp[i][j-1].length() ? dp[i][j-1] : dp[i-1][j];
            }
        }
    }
    return dp[x][y];
}
}


