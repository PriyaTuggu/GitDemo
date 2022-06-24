package demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>(); 
		hs.add("INDIA");
		hs.add("UK");
		hs.add("USA");
		hs.add("INDIA");
		hs.add("JAPAN");
		hs.add("UK1");
		hs.add("RUSSIA");
		
		System.out.println(hs);
		hs.remove("UK1");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
