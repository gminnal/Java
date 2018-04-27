package Java_Package;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]=new int[4][5];
		int k=1;
		int i,j;
		
		for(i=0;i<4;i++)
		{
			for (j=0;j<5;j++)
			{
				a[i][j]=k;
			    k++;
			}
		}
		
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.println("Value at position [i][j] " + i + j + "= " + a[i][j]);
			}
		}
		
		

	}

}
