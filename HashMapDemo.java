import java.util.*;
class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> h = new HashMap<String, String>();
		h.put("Captain", "Dhoni");
		h.put("vicecap" , "kohli");
		System.out.println(h);
		System.out.println(	);
		for(Map.Entry m : h.entrySet())
		{
			System.out.println("Role ==> "+m.getKey()+"\tPlayer ==> "+m.getValue());
		}
	}
}