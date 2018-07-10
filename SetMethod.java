import java.util.*;
class SetMethod 
{
	public static void main(String[] args) 
	{
		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(50);
		System.out.println(s+" ");
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(40));
		Set<String> ss = new HashSet<String>();
		ss.add("Yeshwanth");
		ss.add("kadam");
		System.out.print(ss);
	}
}
