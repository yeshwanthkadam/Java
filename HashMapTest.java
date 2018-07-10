import java.util.*;
class HashMapTest 
{
	public static void main(String[] args) 
	{
		HashMap<Character,String> h = new HashMap<Character,String>();
		h.put('Y',"Yeshwanth");
		h.put('S',"Ece");
		for(Map.Entry m:h.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());}
		System.out.println(h.get('Y'));
	}
}
