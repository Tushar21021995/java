package StringProgramme;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OrderOfOccuranceInConsole {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		String s = str.toLowerCase();
		LinkedHashSet<Character> obj = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			obj.add(s.charAt(i));
		}
		
		System.out.println("enter the char");
		for(Character ch : obj)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+"="+(i+1));
					break;
				}
			}
		}
	}

}
