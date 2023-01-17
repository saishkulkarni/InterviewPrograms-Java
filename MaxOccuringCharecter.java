package ninestars;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MaxOccuringCharecter {

	public static String maxElement(String input)
	{
		char[] c=input.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<c.length;i++)
		{
			Collection<Character> list=map.keySet();
			if(list.contains(c[i]))
			{
				int x=map.get(c[i]);
				x=x+1;
				map.put(c[i], x);
			}
			else
			{
				map.put(c[i], 1);
			}
		}
		
		System.out.println(map);
		
  return null;
	}  
		
	
	public static void main(String[] args) {
	String a="abcdd";
	System.out.println(maxElement(a));
}
}
