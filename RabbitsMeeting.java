package general;

import java.util.ArrayList;
import java.util.Collections;

public class RabbitsMeeting {
public static int minimum(int n,int[] x)
{
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<n-1;i++)
	{
		for(int j=1;j<n;j++)
		{
			int z=x[j]-x[i];
			if(z>0 && z%2!=0) 
			{
			list.add(z);
			}
		}
	}
	Collections.sort(list);
	if(list.isEmpty())
	{
		return 0;
	}
	else {
		return list.get(0);
	}
	
}
public static void main(String[] args) {
	int n=3;
	int[] x= {2,4,6};
	System.out.println(minimum(n, x));
}
}
