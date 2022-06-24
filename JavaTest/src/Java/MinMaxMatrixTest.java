package Java;

public class MinMaxMatrixTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[][] = {{2,4,5},{3,4,7},{1,9,2}};
		int min =b[0][0];
		int max=b[0][0];
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
				}
				
				if(b[i][j]>max)
				{
					max=b[i][j];
				}
				
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("min= "+min);
		System.out.println("max= "+max);
		
}
}