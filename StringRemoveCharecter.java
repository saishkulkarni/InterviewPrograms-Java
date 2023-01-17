package infosys;

public class StringRemoveCharecter {
public static int solve(String s)
{
	String res="";
	int count=0;
	boolean flag=false;
	
	if(s.length()<=1)
	{
		return 0;
	}
	for(int i=0;i<s.length()-1;i++)
	{
		if(s.charAt(i)==s.charAt(i+1))
		{
			flag=true;
			res=res+s.charAt(i);
			break;
		}
		else {
			flag=false;
		}
	}
	if(!flag)
	{
		return s.length()-2;
	}
	if(flag)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<res.length();j++)
			{
				if(res.charAt(j)==s.charAt(i))
				{
					temp=temp+s.charAt(i);
				}
			}
		}
		count=s.length()-(temp.length()+2);
	}
	
	
	return count;
}
public static void main(String[] args) {
	String s="zewmyde";
	System.out.println(solve(s));
}
}
