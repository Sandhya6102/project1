package Collectionstopic;

import java.util.Vector;

public class Sample {
public static void main(String[] args) {
	Vector l1=new Vector();
	{
		
		//add method
		
		l1.add("goa");
		l1.add("wale");
		l1.add("beach");
		l1.add("mey");
		System.out.println(l1);
		
		l1.add("java");
		l1.add("classes");
		
		l1.add("anand");
		System.out.println(l1);
		
		
		l1.add("flower");
		l1.add(2,"show");
		System.out.println(l1);
		
		// addAll
		
		Vector l2=new Vector();
		{
			l2.add("flag");
			l2.add("Nation");
			l2.add("Sandhya");
			l1.addAll(l2);
			
			
			System.out.println(l1);
			
			
			l1.addAll(2,l2);
			System.out.println(l1);
			
			//remove
			
			l1.remove(1);
			System.out.println(l1);
			
			//remove all
			l1.removeAll(l2);
			System.out.println(l1);
			
			System.out.println(l2);
			
			
			//retainAll
			l1.retainAll(l2);
		}
		
	}
}
}
