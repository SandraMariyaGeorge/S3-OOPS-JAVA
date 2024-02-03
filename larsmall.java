import java.util.*;
class larsmall
{
	public static void main(String arg[])
	{
		int a[],i,small,large,n;
		a=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		n=sc.nextInt();
		System.out.println("Enter the Array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		small=large=a[0];
		for(i=0;i<n;i++)
		{
			if(large<a[i])
			{
				large=a[i];
			}
		}
		for(i=0;i<n;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		System.out.println("The Largest element in array is "+large);
		System.out.println("The Smallest element in array is "+small);
	}
}