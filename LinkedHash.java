import java.util.*;
class  LinkedHash
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Yeshwanth");
		lhs.add("kadam");
		lhs.add("satish");
		lhs.add("uma");
		lhs.add("Meghana");
		System.out.println(lhs);
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(lhs.contains("Yeshwanth"));
		lhs.clone();
		System.out.println(lhs);
		lhs.clear();
		System.out.println(lhs);
	}
}
