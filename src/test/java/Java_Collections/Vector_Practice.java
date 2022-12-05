package Java_Collections;

import java.util.Vector;

public class Vector_Practice {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("PATHAK");
		v.add("PATHAK");
		v.add(12345);
		v.add(null);
		v.add(null);
		v.add('@');
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println(v.get(5));
	}

}
