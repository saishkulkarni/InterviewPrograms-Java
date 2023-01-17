package general;

import java.util.ArrayList;
import java.util.List;

public class NumberLogic {
	
	
	
	public static void main(String[] args) {
		int a = 12345;
		List<Integer> list=new ArrayList<>();
		
		while(a>0)
		{
			int rem=a%10;
			
			list.add(rem);
			a=a/10;
		}
		int sum=0;
		for(int i=list.size()-1;i>=0;i--)
		{
			if(i%2==0)
			{
				sum = sum + list.get(i);
			}
			else
			{
				int x=list.get(i);
				int fact=1;
				for(int j=x;j>=1;j--)
				{
					fact=fact*j;
				}
				System.out.println(fact);
			}
		}
		
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
//		String b = a + "";
//		int sum = 0;
//		for (int i = 0; i < b.length(); i++) {
//			if (i % 2 == 0) {
//				sum = sum + Integer.parseInt(b.charAt(i) + "");
//			}
//			else {
//				int x=Integer.parseInt(b.charAt(i) + "");
//				System.out.println(x+" is present in even posititon");
//				System.out.println("The factorial of "+x+":");
//				int fact=1;
//				for(int k=x;k>=1;k--)
//				{
//					fact=fact*k;
//				}
//				System.out.println(fact);
//			}
//		}
//		System.out.println("The sum of odd digits :"+sum);
	}
}
