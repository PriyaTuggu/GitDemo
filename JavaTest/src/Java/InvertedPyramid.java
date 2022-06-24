package Java;

public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int k=1;
		int i=1;
		while(i<=n)
		{
			
			for(int j=1;j<=k;j++)
			{
				System.out.print(i +"\t");
				i++;
			}
			
			k++;
			
			System.out.println();
		}

	}

}
//
//1
//2 3
//4 5 6
//7 8 9 10