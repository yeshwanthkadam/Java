import java.util.*;
class TreeSetMethod 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(3);
		t.add(2);
		t.add(5);
		t.add(17);
		t.add(4);
		System.out.println(t);
		System.out.println("First Element  "+t.first());
		System.out.println("Last Element   "+t.last());
		System.out.println(t.tailSet(3));
		System.out.println(t.higher(3));
		System.out.println(t.headSet(3));
		System.out.println(t.lower(3));
		Set<Integer> set=t.subSet(1,4);
		System.out.println(set);
		
	}
}
