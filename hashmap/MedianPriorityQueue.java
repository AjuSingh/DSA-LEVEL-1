package hashmap;
import java.util.*;

//Input
//add 10
//add 20
//add 30
//add 40
//peek
//add 50
//peek
//remove
//peek
//remove
//peek
//remove
//peek
//remove
//peek
//quit


//Output
//20
//30
//30
//20
//20
//40
//40
//10
//10
//50


//we need to get the median in O(1)
//when ever we are adding some thing else it takes log n and removal also take O(log n);

public class MedianPriorityQueue {
	   private PriorityQueue<Integer> left;
	    private PriorityQueue<Integer> right;

	    public MedianPriorityQueue() {
	        left= new PriorityQueue<>(Collections.reverseOrder());
	        right = new PriorityQueue<>();
	    }
	    
	    public void addNum(int num) {
	       if(right.size()>0 && right.peek()<num){
	           right.add(num);
	       }else{
	           left.add(num);
	       }
	        
	       if(Math.abs(left.size()-right.size())>1){
	           if(left.size()>right.size()){
	               right.add(left.remove());
	           }else{
	               left.add(right.remove());
	           }
	       }
	    }
	    
	    public double findMedian() {
	        if((left.size()+right.size())%2==0){
	            return (double)(left.peek()+right.peek())/2.0;
	        }else{
	            return left.size()>right.size() ? (double)left.peek() : (double)right.peek();
	        }
	    }
}
