package StringProgramme;

public class SwapTheCharacter {

	public static void main(String[] args) 
	{
		String s="welcome to bnglr city";
		String[] s1 = s.split(" ");
		String temp = s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+"");  // output--> citybnglrtowelcome
		}

	}

}
