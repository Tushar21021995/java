package StringProgramme;

import java.util.LinkedHashSet;

public class OrderOfOccurance2ndApporach {

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
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
				 System.out.println(ch+"="+(i+1));     // op will take from back 
				 break;
				}
			}
		}

	}

}
