package Java_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_ArrayList {
	public static void main(String[] args) {
		String arr [] = {"Dog","Cat","Elephant","Tiger"};
		System.out.println("Before Conversion =====");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		// convert the array into the array list
		System.out.println("After Conversion===========");
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
	}

}
