package Java_Package;

import java.util.Scanner;

public class Armstrong {

	public static void main(String args[])
	{
		int a;
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter No : ");
		a = scanner.nextInt();
		int x,sum=0,ono;
		
		ono=a;
		
		while(a>0)
		{
			x=a%10;
			sum=sum+(x*x*x);
			a=a/10;
		}
		
		if(sum==ono)
		{
	         System.out.println("No is armstrong");
	    }
		else
		{
		System.out.println("No not armstrong");	
		}
		
}
}
