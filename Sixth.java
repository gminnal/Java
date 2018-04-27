package Java_Package;

import java.util.Scanner;

public class Sixth {

public static void main(String args[])
{
	String name;
	int a, b, sum, ch;
	
	do {
	System.out.println("MENU");
	System.out.println("***********");
	System.out.println("1--->ADD");
	System.out.println("2--->SUB");
	System.out.println("3--->MUL");
	System.out.println("4--->DIV");
	System.out.println("5---> Quit");
	System.out.println("***********");
	
	Scanner scanner = new Scanner (System.in);
	System.out.print("Enter First No: ");
	a = scanner.nextInt();
	System.out.print("Enter Second No: ");
	b = scanner.nextInt();
	
	
	
	System.out.print("Enter Your Choice: ");
	ch = scanner.nextInt();
	
			
	if(ch==1)
	{
		sum=a+b;
		System.out.println("Addition of Nos "  + a + " + " +b + " = " + sum);
	}
	
	else if(ch==2)
	{
		sum=a-b;
		System.out.println("Subtraction of Nos "  + a + " - " +b + " = " + sum);
	}
	
	else if(ch==3)
	{
		sum=a*b;
		System.out.println("Multiplication of Nos "  + a + " * " +b + " = " + sum);
	}
	
	else if(ch==4)
	{
		sum=a*b;
		System.out.println("Division of Nos "  + a + " / " +b + " = " + sum);
	}
	
} 
	while(ch<5);


}
}
