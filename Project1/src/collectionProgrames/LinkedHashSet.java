package collectionProgrames;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) 
	{
		java.util.LinkedHashSet<Object> obj = new java.util.LinkedHashSet<Object>();
		 obj.add(10);
		 obj.add(10);
		 obj.add('A');
		 obj.add(20);
		 obj.add("Hi");
		 obj.add(null);
		 obj.add(null);
		 //System.out.println(obj);
		 Iterator<Object> it = obj.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 

	}

}
