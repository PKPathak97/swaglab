package Java_Collections;

import java.util.LinkedList;

public class LinkedList_Practice {
	
	public static void main(String[] args) {
		
		LinkedList link = new LinkedList();
		
		link.add("Pathak");
		link.add("Pathak");
		link.add(null);
		link.add(null);
		link.add(1223);
		link.add('*');
		
		System.out.println(link.get(0));
		System.out.println(link.get(1));
		System.out.println(link.get(2));
		System.out.println(link.get(3));
		System.out.println(link.get(4));
		System.out.println(link.get(5));
	}

}
