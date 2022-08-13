package lambda;
import java.util.*;


class Pair{
	int key;
	String value;
	
	Pair(int key,String value){
		this.key = key;
		this.value = value;
	}
	
  public String toString() {
	  return this.key + " " + this.value;
  }
	
}


public class Test2 {
	public static void main(String[] args) {
		ArrayList<Pair> list = new ArrayList<>();
		list.add(new Pair(1,"Ravi"));
		list.add(new Pair(2,"Raja"));
		list.add(new Pair(3,"Sukhman"));
		list.add(new Pair(4,"Aju"));
		list.add(new Pair(5,"Kaman"));
//		list.forEach((n) -> System.out.println(n.key + " " + n.value));
		list.sort((obj1,obj2)->{
			return obj1.value.compareTo(obj2.value);
		});
		
		
		list.sort((obj1,obj2)->{
			return obj1.key-obj2.key;
		});
		System.out.println(list);
	}
}
