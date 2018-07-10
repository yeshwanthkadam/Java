import java.util.*;
class NavigableSetTest 
{
	public static void main(String[] args) 
		NavigableSet<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(25);
		s.add(35);
		System.out.println(s);
		Iterator i =  s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println(s.ceiling(12));
		System.out.println(s.floor(22));
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
	}
}
