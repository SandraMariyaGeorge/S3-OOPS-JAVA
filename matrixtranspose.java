import java.util.*;
class matrixtranspose
{
	public static void main(String arg[])
	{
		int i,j,a[][],b[][],r,c;
		a=new int[10][10];
		b=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and columns of the matrix");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the matrix elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[j][i]=a[i][j];
		    }
		}
		
		System.out.println("The Transpose matrix is:");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}
	