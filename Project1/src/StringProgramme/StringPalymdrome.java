package StringProgramme;

public class StringPalymdrome {

	public static void main(String[] args)
	{
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("it is a palymdrome ");
		}
		else 
		{
			System.out.println("it is not paymdrome");
			
		}

	}

}
