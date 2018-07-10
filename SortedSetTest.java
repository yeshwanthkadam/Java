import java.util.*;
class SortedSetTest 
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(25);
		s.add(15);
		s.add(12);
		s.add(21);
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.subSet(10,21));
	}
}
