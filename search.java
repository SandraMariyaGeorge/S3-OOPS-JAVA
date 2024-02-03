import java.util.*;
class search
{
	public static void main(String arg[])
	{
		int flag=0,n,i,e,a[];
		a=new int[50];
		System.out.println("Enter the limit to array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to be searched");
		e=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if (a[i]==e)
			{
				
				flag=1;
				break;
			}
		}
		
		System.out.println();
		if (flag==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element is found ");
		}
	}
}