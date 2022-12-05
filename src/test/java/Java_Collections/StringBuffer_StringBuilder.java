package Java_Collections;

public class StringBuffer_StringBuilder {
	
public static void main(String[] args)
{
	String h ="Velocity";
	
	//String Buffer
	
	StringBuffer sb = new StringBuffer(h);
	
	sb.reverse();
	System.out.println(sb);
	
	int len =sb.length();
	System.out.println(len);
	
	sb.append(" Katraj");
	System.out.println(sb); 
	
	System.out.println(h);
	
	
	//String Builder
	
	String k ="Java with selenium";
	
	StringBuilder SB = new StringBuilder(k);
	SB.reverse();
	System.out.println(SB);
	
	SB.append(" By Prashant Pathak");
	System.out.println(SB);
	
	
	
	
	
}

}
