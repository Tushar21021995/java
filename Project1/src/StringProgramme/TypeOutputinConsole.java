package StringProgramme;

import java.util.Scanner;

public class TypeOutputinConsole {

	public static void main(String[] args)
	{
		// 24 % 5 --- "hi"
		// 24 % 3 --- "bye"
		// 24 % 5&3 ---"hi bye"
		// 24 & ? --- "good bye"
		
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		if(num%5==0 && num%3==0)
		{
			System.out.println("hi BYe");
		}
		else if(num%5==9)
		{
			System.out.println("hi");
		}
		else if(num%3==0)
		{
			System.out.println("bye");
		}
		else
		{
			System.out.println("Good bye");
		}

	}

}
