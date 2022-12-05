package Java_Collections;

import java.util.LinkedList;

public class LinkedList_Demo {
	
	public static void main(String[] args) {
		LinkedList lk = new LinkedList();
		//add eiement into linkedlist
		 lk.add("pkp");
		 lk.add('f');
		 lk.add(null);
		 lk.add(123);
		 lk.add("pkp");
		 System.out.println(lk);
		 System.out.println(lk.size());
		 lk.remove(3);
		 System.out.println("After removing node =>"+lk);
		 
     // you can set the new element also
	 // you can use contains method also in linked list
		 //you can also the isEmpty methods also
		 //we can read the all element in linkedlist by using for loop, for each loop, and itaretor
		 
		 
	//add new object
		 
		 lk.add(3,789);
		 System.out.println("After adding the Element =>"+lk);
		 lk.addFirst("RTU");
		 System.out.println("after addinf first =>"+lk);
		 
		 //add element in last
		 
		 lk.addLast(80);
		 System.out.println(lk);
		 
		 ////remove first
		 System.out.println("removed Element =>"+lk.removeFirst());
		 System.out.println(lk);
	
	//removelast
		 System.out.println("last element is removed =>"+lk.removeLast());
		 System.out.println(lk);
		 
		 //get first element
		 System.out.println("get first element =>"+lk.getFirst());
		 
		 //getLast element in list
          System.out.println("get the last element in the last =>"+lk.getLast());	
	}

}
