package StackAndQueue.stacksquestion;
import java.util.*;

public class SmallerOnRight {
    public static void main(String[] args) {
        System.out.println(getPhoneNumber("five one zero two four eight zero double three two"));
    }


    public static String getPhoneNumber(String s) {
        // Write your code here
        HashMap<String,String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
           
        
        String str = "",temp="";
        int i=0;
        int n=s.length();
        int prevCount=1;
        while(i<n){
            while(i<n && s.charAt(i)!=' '){
                temp+=s.charAt(i);
                i++;
            }
            if(temp.equals("double")){
                prevCount=2;
                temp="";
                i++;
                continue;
            }else if(temp.equals("triple")){
                prevCount=3;
                temp="";
                i++;
                continue;
            }else{
                for(int j=1;j<=prevCount;j++){
                str+=map.getOrDefault(temp, "");  
                }
                prevCount=1;
                temp="";
                i++;
            }
        }
        return str;
        }
    
    }

    // public static String getPhoneNumber(String s) {
    //     // Write your code here
    //     String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    //     String str = "";
    //     for(int i=0;i<s.length();i++){
    //         str+=arr[s.charAt(i) - '0'] + " ";
    //     }
    //     return str;
    //     }

    // static List<Integer> leftSmaller(int n, int a[])
    // {
    //     //code here
    //     Stack<Integer> stack = new Stack<>();
    //     List<Integer> ans = new ArrayList<>();
    //     for(int i=0;i<a.length;i++){
    //         if(stack.empty()){
    //             ans.add(-1);
    //             stack.push(a[i]);
    //         }else if(!stack.empty() && stack.peek()>=a[i]){
    //             while(!stack.empty() && stack.peek()>=a[i]){
    //                 stack.pop();
    //             }
                
    //             if(stack.empty()){
    //                ans.add(-1);
    //             }else{
    //                 ans.add(stack.peek());
    //             }
    //             stack.push(a[i]);
    //         }else{
    //             ans.add(stack.peek());
    //             stack.push(a[i]);
    //         }
    //     }
    //     return ans;
    // }

