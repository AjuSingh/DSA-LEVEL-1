package Test1;
import java.util.*;
public class InverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int len = (int)(Math.log10(n)+1);
//        int ans = 0;
//        int sz = len;
//        while(n>0){
//            int ld = n%10;
//            ans+=len*((int)(Math.pow(10,sz-ld)));
//            len--;
//            n/=10;
//        }
//        System.out.println(ans);
        String str = sc.next();
//        System.out.println(SearchingChallenge(str));
        String[] arr = str.split("\\*");
        System.out.println(Arrays.toString(arr));
        //we have to traverse from left to right and place in the inverse position                  
    }
    
    

    public static String SearchingChallenge(String str) {
      int k = str.charAt(0)-'0';
      HashMap<Character,Integer> hm = new HashMap<>();
      int i=1,j=1,n=str.length();
      String ans = "";
      while(j<n){
        char ch = str.charAt(j);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        if(hm.size()<=k){
          ans = ans.length()<(j-i+1) ? str.substring(i,j+1) : ans;
        }else{
          while(hm.getOrDefault(str.charAt(i),0)-1!=0){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)-1);
            i++;
          }
          hm.remove(str.charAt(i++));
          ans = ans.length()<(j-i+1) ? str.substring(i,j+1) : ans;
        }
        j++;
      }   
      return ans;
    }


}
