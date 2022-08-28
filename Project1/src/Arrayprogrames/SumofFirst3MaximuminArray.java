package Arrayprogrames;

public class SumofFirst3MaximuminArray 
{
	public static void main(String[] args) 
	{
       int[] a= {4,1,3,2,0};
       //int sum=0;
       //int count=3;       we can do like this also for that we have to use int sum=0 and int count=3 
                           //and then use in for loop i<count
		for(int i=0;i<a.length;i++)
			   // 0   0<5
			  //  1   1<5
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;  // 0 1 2 3 4 
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<3;i++)         // for sum of 1st 3 maximum number and we have to dessending order
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

  }

}
