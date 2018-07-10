import java.util.*;
class ListTest 
{
	public static void main(String[] args) 
	{
		LinkedList c = new LinkedList();
		c.add("Yeshwanth");
		c.add("kadam");
		c.add("ECE");
		System.out.println("original list : "+c);
		c.add(0,"Mr");
		System.out.println("list after adding :"+c);
		List i = new ArrayList();
		i.add(86);
		i.add(64);
		c.addAll(i);
		System.out.println("List : "+c);
		c.addFirst("First");
		c.addLast("Last");
		System.out.println("After adding first and last : "+c);
		Object[] newList = c.toArray();
		for(Object f : newList)
		{
			System.out.print("Array List"+f);
		}
	}
}
