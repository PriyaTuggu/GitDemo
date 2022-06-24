package Java;

public class ChildSuperDemo  extends ParentSuperDemo {



	
		String name="Child Variable";
		public void getStringDate()
		{
			System.out.println(name);
			System.out.println(super.name);
			
		}
		
		
		public ChildSuperDemo()
		{
			super();
			System.out.println("This is Child Constructor");
		}
		public void getMethod()
		
		{
			super.getMethod();
			System.out.println("This is Child Method");
			
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ChildSuperDemo cd = new ChildSuperDemo();
			cd.getStringDate();
			cd.getMethod();
			

		}

	}

	


