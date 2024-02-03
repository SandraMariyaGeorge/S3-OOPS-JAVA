
import java.util.*;
class matrixadd
{
	public static void main(String arg[])
	{
		int i,j,a[][],b[][],c[][],r1,r2,c1,c2;
		a=new int[10][10];
		b=new int[10][10];
		c=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns of 1st matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the 1st matrix elements");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the no of rows and columns of 2nd matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		System.out.println("Enter the 2nd matrix elements");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 1st matrix is:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The 2nd matrix is:");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		if (r1==r2 & c1==c2)
		{
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("The Sum matrix is:");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else 
		{
			System.out.println("Addition not possible");
		}
	}
}
		
