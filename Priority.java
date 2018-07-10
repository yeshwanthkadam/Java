import java.util.*;
class Priority 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(15);
		p.add(8);
		p.add(12);
		for(int i=0;i<3;i++){
			System.out.println(p.peek());
			p.remove();
		}
	}
}
