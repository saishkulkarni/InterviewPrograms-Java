package general;

import java.util.ArrayList;
import java.util.List;

public class VowelTogether {

	public static List<String> vowelUnique(String a1)
	{
		List<String> list=new ArrayList<>();
		boolean flag=true;
		char[] a=a1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a' | a[i]=='e' | a[i]=='i' | a[i]=='o' | a[i]=='u' )
			{
				flag=false;
				
			}
		}
		
		if(flag)
		{
			list.add("There are no vowels in the given string");
		}
	return list;
}

	public static void main(String[] args) {
	String a1="fly";
	List<String> list=vowelUnique(a1);
	for(String c:list)
	{
		System.out.println(c);
	}
	}
}
