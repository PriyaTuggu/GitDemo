package demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Priya");
		al.add(0, "Selenium");
		al.add(1,"Testing");
		al.add("Sushanta");
		al.add("Taanishka");
		System.out.println(al);//[Selenium,Testing,Java,Priya,Sushanta,Taanishka]
		
		al.remove(2);
		al.remove("Priya");
		
		System.out.println(al); //[Selenium,Testing,Sushanta,Taanishka]
		
		System.out.println(al.size());//4
		
		System.out.println(al.get(0));//Selenium
		System.out.println(al.isEmpty());//false
		System.out.println(al.contains("Taanishka")); // true
		System.out.println(al.indexOf("Taanishka"));//3
		
		
		
		
		
		
		
		
 	}

}
