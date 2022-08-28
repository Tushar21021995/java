package StringProgramme;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args)
	{
		String s="tester";
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();     // using linkedhashset it will maintain order of 
		// order of exeecution 
		// output :--- t e s r
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			obj.add(s.charAt(i));

		}
		System.out.println(obj);
	}

}
