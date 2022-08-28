package StringProgramme;

import java.util.LinkedHashSet;

public class CountDuplicates {

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
			
			if(count>1)         // for dupli cate count  and for unique count we have to use count==1 
			{
				System.out.println(stri+"="+count);
			}
		}
                       // we will count duplicate words output--> to=2
	}

}
