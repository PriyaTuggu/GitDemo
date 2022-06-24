package demo;



public class thisDemo {
	int a=5;
	
	public void getMethod()
	{
		int a=3;
		int c=a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo cd = new thisDemo();
		
		cd.getMethod();
		

	}

}


