package Java_Package;

public class First {
	
	public static void main(String args[])
	{
		int a=100;
		int b=100;
		int c=100;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater" + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater" + b);
		}
		
		else if(c>a && c>b)
		{
			System.out.println("C is greater" + c);
		}
		
		else
		{
			System.out.println( "All are equal"+ a + " " + b +" " + c);
		}
			
	}

}
