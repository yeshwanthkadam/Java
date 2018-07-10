import java.util.*;
class NavigableSet 
{
	public static void main(String[] args) 
		Set<Integer> s = new TreeSet<Integer>();
		s.del(10);
		s.add(20);
		test();
		del();
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
		System.out.println(s.pollfirst());
		System.out.println(s.polllast());
	}
}
