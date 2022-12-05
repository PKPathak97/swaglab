package Java_Collections;

import java.util.HashSet;

public class HashSet_Demo1 {
	public static void main(String[] args) {
		
		HashSet <Integer> set1 = new HashSet<Integer>();
		
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		set1.add(16);
		set1.add(17);
		set1.size();
		
		System.out.println("HashSet 1: "+set1);
		
		HashSet <Integer> set2 = new HashSet<Integer> ();
		set2.add(12);
		set2.add(13);
		set2.add(14);
		set2.add(15);
		set2.add(16);
		
//		set1.addAll(set2);
//		System.out.println(set1);
//		
//		//common element 
//		set1.retainAll(set2);
//		System.out.println(set1);
//		
//		//diffrent elelment
//		
//		set1.removeAll(set2);
//		System.out.println("difference " +set1);
		
		//subset
		
		System.out.println(set1.containsAll(set2));
		//System.out.println("SubSet "+set1);
	}

}
