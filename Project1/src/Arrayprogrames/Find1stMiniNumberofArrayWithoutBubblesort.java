package Arrayprogrames;

public class Find1stMiniNumberofArrayWithoutBubblesort {

	public static void main(String[] args) 
	{
		int [] a= {20,5,10,0};
		int min= a[0];  // 20
		for(int i=1;i<a.length;i++)
			
			// i=1   1<4t;
			// i=2   2<4t'
			// i=3   3<4t;
			// i=4   4<4t terminate
		{
			if(min>a[i])    //20>10t, 10>5t, 5t>0
			{
				min=a[i];
			}
		}
		
		System.out.println("first min number in array is="+min);  //0 
		

	}

}
