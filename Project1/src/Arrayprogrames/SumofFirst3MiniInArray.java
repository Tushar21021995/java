package Arrayprogrames;

public class SumofFirst3MiniInArray 
{
	public static void main(String[] args) 
	{
       int[] a= {4,1,3,2,0};
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
					a[j]=temp;  // 0 1 2 3 4 
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<3;i++)         // for sum of 1st 3 minimum number and we have to assending order
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

  }
}
