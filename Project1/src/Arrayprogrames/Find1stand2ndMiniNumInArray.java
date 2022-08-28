package Arrayprogrames;

public class Find1stand2ndMiniNumInArray {

	public static void main(String[] args)
	{
		int[] a= {20,15,10,5};
		int min=a[0];
		for(int i=1;i<a.length;i++)
			// i=1  1<4t 
		{
			min=a[i];
			
		}
		
		System.out.println("First Minimum " +min);
		
		int min2=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min2 && a[i] >min)
			{
				min2=a[i];
			}
			
		}
		System.out.println("Second Minimum " +min2);

	}

}
