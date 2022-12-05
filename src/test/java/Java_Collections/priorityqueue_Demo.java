package Java_Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue_Demo {
	
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		System.out.println(q);
		
		
		
		//get head element 
		System.out.println(q.element());
		System.out.println(q.peek());
		
		
		
		//Return and remove element
	    System.out.println(q.remove());
        System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		
		//read all element
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}

	}

}
