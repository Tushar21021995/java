package Arrayprogrames;

public class Swapn2num2ndapproach {

	public static void main(String[] args)
	{
		int a=10;      // we want a=20;
		int b=20;       // we want b=10;
		a=a+b;       //a=10+20=30
		b=a-b;       // b=30-20=10  (here a value is 30 thats why i am using a=30)
		a=a-b;       // a= 30-10=20
		System.out.println(a);     // another approach fro ssame
		System.out.println(b);
	}

}
