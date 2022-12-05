package Java_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {
	
	public static void main(String[] args) {
		LinkedHashSet lks = new LinkedHashSet();
		lks.add("Prashant");
		lks.add(123);
		lks.add(null);
		lks.add(123); // no accept the duplicate
		lks.add(false);
		
		Iterator it =lks.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
