package demo;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("I am default constructor");
	}
	
	public ConstructorDemo(int a ,int b)
	{
		System.out.println("I am parameterized constructor");
		System.out.println(a+b);
	}
	public ConstructorDemo(String s)
	{
		
		System.out.println(s);
	}

	public void getMethod()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo  cd =new ConstructorDemo ();
		cd.getMethod();
		
		ConstructorDemo cd1= new ConstructorDemo(4,5);
		cd1.getMethod();
		
		ConstructorDemo cd2= new ConstructorDemo("Hello");
		
	}

}
