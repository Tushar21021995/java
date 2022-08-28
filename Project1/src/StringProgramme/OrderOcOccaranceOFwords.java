package StringProgramme;

import java.util.LinkedHashSet;

public class OrderOcOccaranceOFwords {

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
					System.out.println(stri+""+(i+1));
					break;
				}
			}
	}

	}
}
