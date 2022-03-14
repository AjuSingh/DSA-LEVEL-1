package Test1;
import java.util.*;
public class HashPattern {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[][] arr=  new char[n+(n-1)][n+(n-1)];
    int tot = (n+(n-1))*(n+(n-1));
    int rowS=0;
    int colS=0;
    int rowE=n+(n-1)-1;
    int colE=n+(n-1)-1;
    int cnt=0;
    while(cnt<tot){
        //filling top row
        for(int i=colS;i<=colE &&cnt<tot;i++){
            arr[rowS][i] = n%2==0 ? (char)(n + '0'):'#';
            cnt++;
        }
        rowS++;
      //filling the right row
        for(int i=rowS;i<=rowE&&cnt<tot;i++){
            arr[i][colE] = n%2==0 ? (char)(n + '0'):'#';
            cnt++;
        }
        colE--;
        
        //filing the bottom row
        for(int j=colE;j>=colS&&cnt<tot;j--){
            arr[rowE][j] = n%2==0 ? (char)(n + '0'):'#';
            cnt++;
        }
        rowE--;
        //filing the left row
        for(int i=rowE;i>=rowS&&cnt<tot;i--){
            arr[i][colS] = n%2==0 ? (char)(n+'0'):'#';
            cnt++;
        }
        colS++;
        n--;
    }
    
    for(int i=0;i<n+(n-1);i++){
        for(int j=0;j<n+(n-1);j++){
            System.out.print(arr[i][j] + "\t");
        }
        System.out.println();
    }

// 4 4 4 4 4 4 4
// 4 # # # # # 4
// 4 # 2 2 2 # 4
// 4 # 2 # 2 # 4
// 4 # 2 2 2 # 4
// 4 # # # # # 4
// 4 4 4 4 4 4 4
 }
}
