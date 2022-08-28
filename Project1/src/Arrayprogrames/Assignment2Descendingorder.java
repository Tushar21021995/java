package Arrayprogrames;

public class Assignment2Descendingorder {

	public static void main(String[] args) 
	{
		int [] a= {1,0,1,0,0,1};         // output be like 1 1 1 0 0 0
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])          // for decsending order
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
