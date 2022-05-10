package linkedList.questions;

public class MergeKSortedList {
public static void main(String[] args) {

//brute force approach 
//Time complexity O(n*K)
//	class Solution {
//	    public ListNode mergeKLists(ListNode[] lists) {
//	    if(lists.length==0){
//	        return null;
//	    }
//	    ListNode head = lists[0];
//	    for(int i=1;i<lists.length;i++){
//	        head = merge(head,lists[i]);
//	    }
//	        return head;
//	    }
//	    
//	    ListNode merge(ListNode list1,ListNode list2){
//	        ListNode head = new ListNode();
//	        ListNode dummy = head;
//	        while(list1!=null && list2!=null){
//	         if(list1.val<=list2.val){
//	             dummy.next = list1;
//	             list1= list1.next;
//	         }else{
//	             dummy.next = list2;
//	             list2 = list2.next;
//	         }
//	         dummy = dummy.next;
//	        }
//	        
//	        if(list1!=null){
//	            dummy.next = list1;
//	        }
//	        
//	        if(list2!=null){
//	            dummy.next = list2;
//	        }
//	        
//	        return head.next;
//	    }
//	}
	
	

	
	
	
	
	
//Time Complexity will be O(nlogk);
// N is total number of nodes and k is the size of lists array
//	class Solution {
//	    public ListNode mergeKLists(ListNode[] lists) {
//	     if(lists.length==0) return null;
//	     return mergeSort(0,lists.length-1,lists);
//	    }
//	    
//	    
//	    ListNode mergeSort(int s,int e,ListNode[] arr){
//	       if(s==e) return arr[s];
//	       if(s>e) return null;
//	        
//	        int mid = s + (e-s)/2;
//	        ListNode l1 = mergeSort(s,mid,arr);
//	        ListNode l2 = mergeSort(mid+1,e,arr);
//	        return merge(l1,l2);
//	    }
//	    
//	    ListNode merge(ListNode list1,ListNode list2){
//	        ListNode head = new ListNode();
//	        ListNode dummy = head;
//	        while(list1!=null && list2!=null){
//	         if(list1.val<=list2.val){
//	             dummy.next = list1;
//	             list1= list1.next;
//	         }else{
//	             dummy.next = list2;
//	             list2 = list2.next;
//	         }
//	         dummy = dummy.next;
//	        }
//	        
//	        if(list1!=null){
//	            dummy.next = list1;
//	        }
//	        
//	        if(list2!=null){
//	            dummy.next = list2;
//	        }
//	        
//	        return head.next;
//	    }
//	}	
	
	
	
}



}
