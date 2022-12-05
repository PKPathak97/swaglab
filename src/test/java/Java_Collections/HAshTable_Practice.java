package Java_Collections;

import java.util.Hashtable;

public class HAshTable_Practice {
	
	public static void main(String[] args) {
		//only unique key
		//No null key and No null Value
		
		Hashtable htable =  new Hashtable();
		
		htable.put(1, 452.20);
		htable.put(1, 478);
		htable.put("pk", 45);
		htable.put("prash", 45); 
//		htable.put(null, null);
//		htable.put(9, null);
//		htable.put(null, "Velocity");
		
		System.out.println(htable.get(1));
	//	System.out.println(htable.get(1));
		System.out.println(htable.get("pk"));
		System.out.println(htable.get("prash"));
	//	System.out.println(htable.get(null));
	//	System.out.println(htable.get(9));
	//	System.out.println(htable.get(null));

		
		
	}

}
