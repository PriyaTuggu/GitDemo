package Java;

public class MultiDimensionalArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2* 2 Matrix 
		int a[][]= new int[2][2];
		a[0][0]=40;
		a[0][1]=50;
		a[1][0]=60;
		a[1][1]=70;
		
		for (int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		//3 *3 Matrix
		
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
