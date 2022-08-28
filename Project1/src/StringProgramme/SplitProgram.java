package StringProgramme;

public class SplitProgram {

	public static void main(String[] args) 
	{
		String s="Welcome to bangalore city";
		String[] s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i]+" ");
		}
	}

}

// output will be like city bangalore to welcome