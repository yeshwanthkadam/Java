import java.util.*;
class TreeMapEg 
{
	public static void main(String[] args) 
	{
		TreeMap<String,TreeMap<String, Integer>> t = new TreeMap<String,TreeMap<String, Integer>>();
		TreeMap<String, Integer> t1 = new TreeMap<String, Integer>();
		
		t1.put("Sachin",500);
		
		t.put("India",t1);
		
		t1.put("Mahi",680);
		t1.put("kohli",670);
		t1.put("Dhawan",500);
		t1.put("Raina",550);
		t1.put("Rahul",650);
		
		TreeMap<String, Integer> t2 = new TreeMap<String, Integer>();
		t2.put("aSachin",500);
		
		t.put("Aus",t2);
		
		t2.put("warne",680);
		t2.put("Ricky",670);
		t2.put("Lee",500);
		t2.put("Starc",550);
		t2.put("Smith",650);
		
		for(String m : t.keySet())
		{
			TreeMap<String, Integer> test = t.get(m);
			for(Map.Entry m2 : test.entrySet())
			{
				System.out.println(m + "   " + m2.getKey() + "  " + m2.getValue());
			}
		}
		
	}
}
