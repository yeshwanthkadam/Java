import java.util.*;
class Queues 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the elements");
		for(int i=0;i<5;i++)
		{
			p.add(sc.nextInt());
		}
		System.out.println("Size of the queue is : "+p.size());
		System.out.println("Elements in the queue are : "+p);
		System.out.println("priority Queue");
		for(int i=0;i<5;i++){
			System.out.println(p.peek());
			p.remove();
		}
		
	}
}
