package Java_Package;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String args[])
	{
		int a;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter No : ");
		a = scanner.nextInt();
		int x;
		
		while(a>0)
		{
			x=a%10;
			System.out.println(x);
			a=a/10;
		}
	}
}
