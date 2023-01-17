package motorola;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayFreqValSame {
public static int solution(int[] A)
{
	int[] B=new int[A.length];
	int visted=-1;
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=0;i<A.length;i++) {
		int count=1;
		for(int j=i+1;j<A.length;j++)
		{
			if(A[i]==A[j])
			{
				count++;
				B[j]=visted;
			}
		}
		if(B[i]!=visted)
		{
			B[i]=count;
		}
	}
	
	for(int i=0;i<A.length;i++)
	{
		if(B[i]!=visted && A[i]==B[i])
		{
		list.add(A[i]);	
		}
		
	}
	Collections.sort(list);
	if(list.isEmpty())
	{
		return 0;
	}
	return list.get(list.size()-1);
	 
}

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 1, 5 };
		System.out.println(solution(a));
	}
}
