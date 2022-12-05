package Java_Collections;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList_demo2 {
	public static void main(String[] args) {
		LinkedList kl = new LinkedList();
		kl.add("X");
		kl.add("Y");
		kl.add("Z");
		kl.add("A");
		kl.add("B");
		kl.add("C");
		
		
		LinkedList pk = new LinkedList();
		pk.addAll(kl);
		System.out.println("After adding all =>"+pk);
		pk.removeAll(kl);
		System.out.println("After removing all"+pk);
		
		//only for same data type
		//sort
		Collections.sort(kl);
		System.out.println("After Sorting =>"+kl);
		
		Collections.sort(kl,Collections.reverseOrder());
		System.out.println("Reverse order"+kl);
	}

}
