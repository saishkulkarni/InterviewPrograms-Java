package general;

import java.util.ArrayList;
import java.util.List;

public class Pairs {

	public static int findNumberOfPairs(List<Integer> a,List<Integer> b)
	{
		int count=0;
		List<Integer> m= new ArrayList<>();
		List<Integer> n= new ArrayList<>();
		
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<b.size();j++)
			{
				if(a.get(i)>b.get(j))
				{
					if(n.contains(b.get(j)) && m.contains(a.get(i)) )
					{
					}
					else {
						count++;
					}
					n.add(b.get(j));
					m.add(a.get(i));
	
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(3);
		a.add(1);
		a.add(2);
		a.add(3);
		List<Integer> b=new ArrayList<>();
		b.add(3);
		b.add(1);
		b.add(1);
		b.add(1);
		
		System.out.println(findNumberOfPairs(a, b));
	}
	
}
