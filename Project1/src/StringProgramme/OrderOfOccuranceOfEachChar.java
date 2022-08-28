package StringProgramme;

import java.util.LinkedHashSet;

public class OrderOfOccuranceOfEachChar {

	public static void main(String[] args) 
	{
		String s="tester";
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
		}

		for(Character ch : obj)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
					break;

				}
			}
		}

		//t=1    output will be position the char as per order
		//e=2
		//s=3
		// 4=6

	}

}
