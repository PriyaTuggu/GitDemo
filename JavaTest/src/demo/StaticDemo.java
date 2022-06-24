package demo;

public class StaticDemo {
	
	String name;
	String Address;
	static String city="Pune";
	
	public StaticDemo(String name,String address)
	{
		this.name=name;
		this.Address=address;
		
		
	}
	public void Addressmethod(){
		System.out.println(Address);
	}
	public static void CityMethod()
	{
		System.out.println(city);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StaticDemo sd= new StaticDemo("Priya","Entrada");
		StaticDemo sd1=new StaticDemo("Sushanta","Royal");
		sd1.Addressmethod();
		sd.Addressmethod();
		StaticDemo.city="Bangalore";
		StaticDemo.CityMethod();
		
	}

}
