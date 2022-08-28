package StringProgramme;

public class ToRemoveSpaceBetweenWords {

	public static void main(String[] args) 
	{
		String s="Welcome to bglr city";    // op--> 
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length;i++)
		{
			//System.out.println(s1[i]);
			
			String s2 = s1[i];
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.println(s2.charAt(j));
			}
			
			System.out.println(" ");
		}
		
	}

}
