package demo;

import java.util.ArrayList;

public class uniqueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,5,5,4,6,6,9,4};
		int k;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			k=1;
			
			if(!al.contains(a[i]))
				
			{
				al.add(a[i]);
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
			System.out.println(a[i]+"-"+k);
			
			if(k==1)
			{
				System.out.println(a[i]+" is a unique number");
			}
			}
			
		
		}
		

	}

}
