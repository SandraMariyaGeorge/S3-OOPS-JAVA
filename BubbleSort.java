import java.util.*;
class BubbleSort
{
	public static void main(String arg[])
	{
		int n,i,j,a[],temp;
		a=new int[50];
		System.out.println("Enter the limit to array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The Entered Array is:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted Array is:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
