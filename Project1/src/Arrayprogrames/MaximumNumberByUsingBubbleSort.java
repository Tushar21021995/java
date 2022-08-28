package Arrayprogrames;

public class MaximumNumberByUsingBubbleSort
{
	public static void main(String[] args) 
	{
		int[] a= {4,1,3,2,0};
		for(int i=0;i<a.length;i++)   // fetching elements from array one by one
			//   0  =  0<5
		   //    1  =  1<5
		{
			for(int j=i+1;j<a.length;j++)  // iterating elemnets one after another
				// j=1 1<5 t, j=1 1<5t
				// j=2 2<5 t
				// j=3 3<5 t
				// j=4 4<5 t


			{ 
				if(a[i]<a[j])            // for assending(>) and for descending (<) use
				{
					int temp=a[i];   // 4=4 1=1
					a[i]=a[j];       // 1=1 0=0
					a[j]=temp;       // 4=4  1=1
				}
			}
		}

		//System.out.println(a[0]);   // first minimum we to do program in assending order and then give only a[0]
		System.out.println(a.length-1);   // maximum number
		System.out.println(a[1]);       // 2nd maxi 

	}

}
