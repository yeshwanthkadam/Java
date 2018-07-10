import java.util.*;
class  HashTest
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(1,"Yeshwanth");
		h.put(2,"Anmol Pansari");
		for(Map.Entry m : h.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Iterator<Entry<Integer,String>> it = h.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,String> m =(Map.Entry<Integer,String>) it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
