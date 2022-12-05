package Java_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Practice {
	
	public static void main(String[] args) {
		//no Duplicate
		//only one null Value
		//no Insertion order
		
		HashSet h = new HashSet();
		
		h.add("Prashant");
		h.add("Prashant");
		h.add(12345);
		h.add(null);
		h.add(null);
		h.add('%');
		
		for(Object e:h)
		{
			System.out.println(e);
		}
		System.out.println("=================================");
	Iterator k =	h.iterator();
	
	while(k.hasNext())
	{
		System.out.println(k.next());
	}
	
	}
	
	

}
