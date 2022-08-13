package designPattern;

import java.util.*;

public class PracticeForHashCodeAndEquals {
	public static void main(String[] args) {
		Point[] point = new Point[5];
		point[0] = new Point(0, 0);
		point[1] = new Point(1, 1);
		point[2] = new Point(0, 0);
		point[3] = new Point(0, 1);
		point[4] = new Point(1, 1);

		HashMap<Point, Integer> map = new HashMap<>();
		for (Point p : point) {
			if (map.containsKey(p)) {
				map.put(p, map.get(p) + 1);
			} else {
				map.put(p, 1);
			}
		}
		
		System.out.println(map);
	}
}
