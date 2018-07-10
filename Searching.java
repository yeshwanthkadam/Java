import java.util.*;
class Searching 
{
	public static void main(String[] args) 
	{
		int i,num,e,a[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		num=sc.nextInt();
		a= new int [num];
		for (i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be found");
		e = sc.nextInt();
		for(i=0;i<num;i++)
		{
			if(a[i]==e)
			System.out.println(e+" is found at "+(i+1));
			break;
		}
	}
}
