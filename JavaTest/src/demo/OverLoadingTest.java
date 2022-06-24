package demo;

public class OverLoadingTest {
	
	public void getDate(int a)
	{
		System.out.println(a);
	}

	public void getData()
	{
		System.out.println("This is get Data");
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a,int b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingTest ot = new OverLoadingTest();
		ot.getData();
		ot.getDate(5);
		ot.getData(1, 2);
		ot.getData("Hello");

	}

}
