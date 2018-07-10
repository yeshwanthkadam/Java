import java.util.*;
class Practice
{
	public static void main(String[] args) 
	{
		int s=0,n,i,rev=0,temp=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		for(i=n;i>0;i/=10)
		{
			s=i%10;
			rev=(rev*10)+s;
		}
		if (temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
