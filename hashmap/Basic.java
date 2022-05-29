package hashmap;
import java.util.*;

public class Basic {
	public static void main(String[] args) {
	HashMap<String,Integer> hm = new HashMap<>();
	hm.put("Kaman", 2);
	hm.put("Raja", 4);
	hm.put("Aju", 1);
	hm.put("Ravi", 3);
	
	//how to traverse hm
	Set<String> set = hm.keySet();
	for(String key:set) {
		System.out.println(key + " " + hm.get(key));
	}	
	
	} 
	
	
	
}
