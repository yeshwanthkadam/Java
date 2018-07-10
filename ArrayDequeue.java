import java.util.*;
class ArrayDequeue 
{
	public static void main(String[] args) 
	{
		ArrayDequeue<Integer> a = new ArrayDequeue<Integer>();
		a.add(30);
		a.add(20);
		a.add(10);
		a.add(40);
		System.out.println("Elements in the queue are : ");
		while(a.peek()!=null)
		{
			System.out.print(a.pop());
		}
	}
}
