package Java_Package;

import java.util.Scanner;

public class Sumofnos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int no;
	    int fact=1; 
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter No : ");
		a = scanner.nextInt();
		no=a;		
		while(a>1)
		{
			fact=fact*a;
			a=a-1;
			
		}
		
		System.out.println("Factorial of Number" + " "  + no + " = " + fact);
		

	}

}
