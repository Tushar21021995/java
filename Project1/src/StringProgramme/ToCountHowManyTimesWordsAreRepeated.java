package StringProgramme;

import java.util.LinkedHashSet;

public class ToCountHowManyTimesWordsAreRepeated {

	public static void main(String[] args)
	{
		
		String s= "welcome to to bnglr city";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			obj.add(str[i]);
		}
		
		for(String stri : obj)
		{
			int count =0;
			for(int i=0;i<str.length;i++)
			{
				if(stri.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(stri+"="+count);
	}                                  // output--> it prints every words how many times print
		                               // like welcome=1 , to=2 like that
}
}
