package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_demo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList add = new ArrayList();
		add.addAll(al);
		System.out.println("After Adding Element => "+add);
		
		add.removeAll(al);
		System.out.println("After Removing Elements =>"+add);
		
		//sorting the ArrayList
		System.out.println("Elements in ArrayList =>"+al);
		
		Collections.sort(al);
		System.out.println("Elements after sorting =>"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After reverse sorting Elements =>"+al);
		
		//shuffling
		Collections.shuffle(al);
		System.out.println("after shuffling =>"+al);
		
	}

}
