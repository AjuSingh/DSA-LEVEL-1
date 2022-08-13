package binarytree;
import java.util.*;

public class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// for same grouping in bucket
	public int hashCode(Point obj) {
		return obj.x + obj.y;
	}
    
	
	//for the comparision during the insertion in the linked list
	public boolean equals(Point obj) {
		return this.x == obj.x && this.y == obj.y;
	}
}
