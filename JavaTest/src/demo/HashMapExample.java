package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1, "Priya");
		hs.put(2, "Taanishka");
		hs.put(3, "Sushanta");
		hs.put(4, "Tuggu");
		hs.put(5, "Gullu");
		System.out.println(hs);
		
		hs.remove(5);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.get(4));
		
		Set s= hs.entrySet();
		Iterator i =s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry mp = (Map.Entry) i.next();
			System.out.println(mp.getKey() + " "+mp.getValue());
			
		}
		
		
		
		
		

	}

}
