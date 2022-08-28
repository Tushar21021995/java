package StringProgramme;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {

	public static void main(String[] args)
	{
		String s="welcome to bnglr city city";
		String[] str = s.split(" ");
		LinkedHashSet<String> obj = new LinkedHashSet<String>();     // using linkedhashset it will maintain order of 
		// order of exeecution 
		// output :--- t e s r
		
		for(int i=0;i<str.length;i++)
		{
			//System.out.println(s.charAt(i));
			obj.add(str[i]);

		}
		System.out.println(obj);
	}

	}


