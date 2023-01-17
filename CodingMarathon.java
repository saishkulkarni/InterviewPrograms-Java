package slk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodingMarathon {
	
	public static int result(int n,int k,int[] x) {
		int sum=0;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<x.length;i++)
		{
			list.add(x[i]);
		}
		Collections.sort(list);
		System.out.println(list);

		int count=0;
		for(int i=list.size()-1;i>=0;i--)
		{
		
			if(count<k)
			{
				sum=sum+list.get(i);
				count++;
			}
		}

		return sum;
	}
	
	public static void main(String[] args) {
			int n=4;
			int k= 2;
			int[] x= {4,1,2,5};
			
			System.out.println(result(n,k,x));
		


				
	
	}
	
	}
