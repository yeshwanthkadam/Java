import java.util.*;
class MapExample 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> t = new TreeMap<Integer,String>();
		t.put(1,"Dhoni");
		t.put(2,"Dhoni");
		t.put(3,"Dhoni");
		t.put(4,"Dhoni");
		System.out.println(t);
		TreeMap<Integer,String> t1 = new TreeMap<Integer,String>();
		t1.put(7,"Dhoni");
		t1.put(2,"Raina");
		System.out.println(t1);
		System.out.println(t1.get(7));
		t.replace(3,"Dhoni","Virat");
		System.out.println(t1);
		t.putAll(t1);
		for(Map.Entry m : t.entrySet())
		{
			System.out.println(m.getKey()+"==>"+m.getValue());
		}
	}
}
