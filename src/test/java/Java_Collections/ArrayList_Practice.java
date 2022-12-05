package Java_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Practice {
	
	public static void main(String[] args) {
		ArrayList <String> arr = new ArrayList <String>(); // it will store only String in its List
		
		arr.add("Pune");
		arr.add("Velocity");
		arr.add("Velocity");
		arr.add(null);
		arr.add(null);
		arr.add("Katraj");
		arr.add("Prashant");
		
		System.out.println(arr.get(4));
		System.out.println(arr.get(0));
		System.out.println(arr.get(2));
		//System.out.println(arr.get(4));
		ArrayList arr1 = new ArrayList();
		
		
		System.out.println("============================================");
		
		
		arr1.add(456789);
		arr1.add("Pathak");
		arr1.add("Pathak");
		arr1.add(null);
		arr1.add(null);
		arr1.add('%');
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		System.out.println(arr1.get(5));
  System.out.println("==========================================================");
  
  //List al = new ArrayList();
  
  ArrayList al = new ArrayList();
  
  al.add(456);
  al.add("Prashant");
  al.add('&');
  al.add(true);
  al.add(null);
  al.add(456);
  
  System.out.println(al);
  //size
  System.out.println("Nuber of element "+al.size());
  
  //remove
  al.remove(4);// here 4 is index
 // al.remove(null);// null is element
  System.out.println("Arraylist after remove "+al);
  
  //insert the new element
  //add(index,object)
  
  al.add(3,null);
  System.out.println("Arraylist after insertion "+al);
  
  //retrive specific element
  System.out.println(al.get(3));
  
  //change the element
  al.set(4, false);
  System.out.println("After replacing new element "+al);
  
  //searching 
  System.out.println(al.contains("Prashant"));
  System.out.println(al.contains("Pathak"));
  
  //isempty
 System.out.println(al.isEmpty());
  
 
 //read all deta from list
 
 // For Loop
 System.out.println("Read data of list by For Loop ========");
 for(int i=0;i<al.size();i++)
 {
	 System.out.print(al.get(i)+" ");
 }
  System.out.println();
  
  //for--each loop
 
 System.out.println("read data by the For each loop===========");
 for(Object e :al)
 {
	 System.out.print(e+" ");
 }
  
  //by Itrater methods
 System.out.println();
 
 System.out.println("Reading element by Itrator method ===============");
 
 Iterator it =al.iterator();
 
 while(it.hasNext())
 {
	 System.out.print(it.next()+" ");
 }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
		
	}

}
