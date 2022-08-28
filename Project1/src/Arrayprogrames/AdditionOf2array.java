package Arrayprogrames;

public class AdditionOf2array {

	public static void main(String[] args) 
	{
		int [] a= {5,1,2,4,2};
		int [] b= {2,3,1,5};
		
		// O/P:- 7 4 3 9 2
		
		int length=a.length;  // 5
		if(a.length<b.length) //5<4f
		{
			length=b.length;
		}
		
		for(int i=0;i<length;i++)
			// i=0  0<5
			// i=1  1<5
			// i=2  2<5
			// i=3  3<5
			// i=4  4<5
		{
			try 
			{
				System.out.println(a[i]+b[i]);   //5+2=7, 1+3=4, 2+1=3, 4+5=9, exception
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]+ "");   // 2
				}
				else
				{
					System.out.println(a[i]+"");
				}
			}
		}
		
		

	}

}
