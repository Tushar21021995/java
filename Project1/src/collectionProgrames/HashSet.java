package collectionProgrames;

import java.util.Iterator;


public class HashSet {

	public static void main(String[] args)
	{

		 java.util.HashSet<Object> obj = new java.util.HashSet<Object>();
		
	
		
		 obj.add(10);
		 obj.add(10);
		 obj.add('A');
		 obj.add(20);
		 obj.add("Hi");
		 obj.add(null);
		 obj.add(null);
		 System.out.println(obj);
		 Iterator<Object> it = obj.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
	}

}
