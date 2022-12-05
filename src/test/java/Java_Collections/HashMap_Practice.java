package Java_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Practice {
	
	public static void main(String[] args) {
		
		//only Unique Key
		//only one Null key
		//duplicate value accept
		//Multiple null value
		
		//HashMap <Integer,String> hmap = new HashMap<Integer,String>();
		HashMap hmap = new HashMap();
		
		hmap.put(1, "Pathak");
		hmap.put(2, "Prashant");
		hmap.put(45, null);
		hmap.put(null, null);
		//hmap.put(null, "Doctor");
		hmap.put(3, "Prashant");
		hmap.put(4, "Prashant");
		
		System.out.println(hmap.get(1));
		System.out.println(hmap.get(1));
		System.out.println(hmap.get(45));
		System.out.println(hmap.get(null));
		System.out.println(hmap.get(null));
		System.out.println(hmap.keySet());
		
		// to print all the Keys
		for(Object i :hmap.keySet())
		{
			System.out.println(i);
		
		}
		
		System.out.println(hmap.values());
		
		// To print all the Values
		for(Object t: hmap.values())
		{
			System.out.println(t);
		}
		
		
		for(Object j: hmap.values())
		{
			if(j=="Prashant")
			{
				System.out.println("Yes this is present Map");
			}
			else
			{
				System.out.println("not present in the map");
			}
		}
		
		
		//to print the all keys and values in console
		for(Object k :hmap.keySet())
		{
			System.out.println(k+"    "+hmap.get(k));
		}
		
		
		System.out.println("========================================================");
		
		//Entry Methods
		HashMap <Integer,String> hmap1 = new HashMap<Integer,String>();
		hmap1.put(10, "Devid");
		hmap1.put(20, "Smith");
		hmap1.put(30, "Maxwel");
		hmap1.put(40, "Ritu");
		for(Map.Entry entry : hmap1.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		System.out.println("======================================");
		
		// itrative method
		Set s=hmap1.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
