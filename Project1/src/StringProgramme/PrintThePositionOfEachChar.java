package StringProgramme;

import java.util.LinkedHashSet;

public class PrintThePositionOfEachChar {

	public static void main(String[] args)
	{
		String s="tester";
		
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i)+"="+(i+1));
		}

	}

}
