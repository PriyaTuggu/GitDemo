package Java;

public class CiscoMatrix {
//identify  maximum number of column contains minimum number  -Output should be 3 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][] = {{2,4,5},{3,4,7},{1,9,0}};
		int maxnumber = 0;
		int min =b[0][0];
		int max=b[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				
			{
				if(b[i][j]<min)
				{
					min=b[i][j];
					maxnumber=j;
					
				}
				
				
				
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("min= "+min);
		
	
	
	int k=0;
	while(k<3)
	{
		
		if(b[k][maxnumber] > max)
		{
		 max=b[k][maxnumber];
		}
		k++;
	}
	
	
	System.out.println("maximum number of column having minimum value= "+max);
}
}
