package collectionProgrames;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		
            HashSet<Object> obj = new HashSet<Object>();
            obj.add(10);
            obj.add(10);
            obj.add(20);
            obj.add('A');
            obj.add("Hi");
            System.out.println(obj);
	}

}
