package Arrayprogrames;

public class Assignment {

	public static void main(String[] args)
	{
		int [] a= {1,0,1,0,0,1};      // o/p- 0 0 0 1 1 1
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])           // for assending order we used (>) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		
		for(int k=0; k<a.length;k++)
		{
			System.out.println(a[k]);     // output:- 0 0 0 1 1 1
		} 
		

	}

}
