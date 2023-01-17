package ninestars;

import java.util.ArrayList;
import java.util.List;

public class PushZerosToEnd {

	public static int[] pushzero(int[] input1,int input2)
	{
	int[] x=new int[input2]; 
	List<Integer> ans=new ArrayList<>();
	
	for(int i=0;i<input2;i++)
	{
		if(input1[i]==0)
		{
			continue;
		}
		else {
			ans.add(input1[i]);
		}
	}
	for(int i=0;i<ans.size();i++)
	{
		x[i]=ans.get(i);
	}
	
	
	return x;
	
	}
	public static void main(String[] args) {
		int n=4;
		int[] a= {5,0,7,6};
		int[] x=pushzero(a, n);
		for(int i:x)
		{
			System.out.println(i);
		}
	}
}
