package linkedList.questions;

public class mergeTwoSortedLinkedList {
    public static void main(String[] args) {
        // class Solution {
        //     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                  //we will return the empty list if both are empty
        //         if(list1==null && list2==null){
        //             return list1;
        //         }

        //         if(list1==null){
        //             return list2;
        //         }
                
        //         if(list2==null){
        //             return list1;
        //         }
                
        //         //set the head of the merged sorted list
        //         ListNode head;
        //         if(list1.val<=list2.val){
        //             head = list1;
        //             list1 = list1.next;
        //         }else{
        //             head = list2;
        //             list2 = list2.next;
        //         }
                
                
        //         ListNode temp = head;
        //         while(list1!=null && list2!=null){
        //           if(list1.val<=list2.val){
        //               temp.next = list1;
        //               list1 = list1.next;
        //           }else{
        //               temp.next = list2;
        //               list2 = list2.next;
        //           }   
                        //this is because to extend the list end 
        //             temp = temp.next;
        //         }
                //at the end if elements left or not
        //         if(list1!=null){
        //             temp.next = list1;
        //         }
                
        //         if(list2!=null){
        //             temp.next = list2;
        //         }
        //         return head;
        //     }
        // }   
    }
    
}
