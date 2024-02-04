import java.util.*;
class palin_string
{
	public static void main(String a[])
	{
		String str;
		int len,i,j,flag=0;
		char s;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string ");
		str=sc.nextLine();
		len=str.length();
		System.out.println("length is "+len);
		for(i=0,j=len-1;i<j;i++,j--)
		{
			if (str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(str+" is palindrome\n");
		}
		else 
		{
			System.out.println(str+" is not palindrome\n");
		}
	}
}
