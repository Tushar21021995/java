package StringProgramme;

public class ReverseProgram {

	public static void main(String[] args) 
	{
		String s="laptop";
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}

		
		// reversing a arrau using 3rd variable
//		
//		String s= "laptop";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		
	// reversing a string using toCharArray	
//		String s="laptop";    
//		char [] c=s.toCharArray();
//		for(int i=c.length-1;i>=0;i--)
//		{
//			System.out.println(c[i]);
//		}
	}

}
