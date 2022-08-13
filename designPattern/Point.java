package designPattern;

public class Point {
	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + this.x + "," + this.y + "]";
	}

	// for same grouping in bucket
	public int hashCode() {
		return this.x + this.y;
	}
    
	
	//for the comparision during the insertion in the linked list
	@Override
	public boolean equals(Object obj) {
		Point other = (Point)obj;
		
		if(this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}
}
