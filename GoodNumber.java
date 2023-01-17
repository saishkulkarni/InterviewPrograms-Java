package infosys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodNumber {
public static int solve(int N,List<Integer> A)
{
	int count=0;
	boolean flag=true;
	for(int a:A)
	{
		if(!checkPrime(a))
		{
			flag=false;
			break;
		}
	}
	if(flag)
	{
		count=0;
	}
	else {
		Collections.sort(A);
		int max=A.get(A.size()-1);
		for(int i=0;i<A.size()-1;i++)
		{
			if(max%A.get(i)==0)
			{
				count=A.size()/2;
				break;
			}
			else {
				count=A.size();
			}
		}
	}
	return count;
}

public static boolean checkPrime(int N)
{
	boolean flag=true;
	for(int i=2;i<N;i++)
	{
		if(N%i==0)
		{
			flag=false;
			break;
		}
	}
	return flag;
}

public static void main(String[] args) {
	int N=4;
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(15);
	list.add(30);
	list.add(6);
	System.out.println(solve(N, list));
}
}
