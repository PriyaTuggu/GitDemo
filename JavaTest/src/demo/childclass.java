package demo;

public class childclass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass cc = new childclass();
		cc.brake();
		cc.colour();
		cc.engine();
	}

	public void engine()
	{
		System.out.println("This is Engine");
	}
	
	public void colour()
	{
		System.out.println(color);
	}
}
