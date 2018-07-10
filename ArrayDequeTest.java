import java.util.*;  
class ArrayDequeTest 
{
		public static void main(String args[])
	{
		//ArrayDeque a = new ArrayDeque();
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		//Deque<Integer> a=new ArrayDeque();  
		a.offer(10);
		a.add(20);
		a.add(30);
		a.add(40);
		while(a.peek()!=null)
		{
		System.out.print(a.pop()+" ");
		}
		System.out.println();
			//Stack operation
			a.push(1);
			a.push(2);
			a.push(3);
			while(a.peek()!=null)
		{
				System.out.println(a.pop()+" ");
		}
	
	
	}
}
