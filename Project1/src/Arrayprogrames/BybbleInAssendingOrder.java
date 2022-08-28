package Arrayprogrames;

public class BybbleInAssendingOrder {

	public static void main(String[] args) 
	{
       int[] a= {4,1,3,2,0};                // 4 1 3 2 0
		for(int i=0;i<a.length;i++)
			   // 0   0<5
			  //  1   1<5
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
			
		}

	}

}
