package Arrayprogrames;

public class BubbleByDescendingOrder 
{
		public static void main(String[] args) 
		{
	       int[] a= {4,1,3,2,0};
			for(int i=0;i<a.length;i++)   // fetching elements from array one by one
				   // 0 =  0<5
				  //  1  = 1<5
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
			
			for(int k=0;k<a.length;k++)           // printing the elements one after soting 
			{
				System.out.println(a[k]);     // 4, 3,2,1,0
				
			}

		}

	}



