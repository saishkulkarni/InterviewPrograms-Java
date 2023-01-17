package general;

public class StringChallenge
{
public static void main(String[] args) {
	String s="hello*3";
 	System.out.println(stringChallenge(s));
}

public static String stringChallenge(String str)
{
	String token="yvuga1ch3d";
	String res="";
	String ans="";
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
	if(Character.isAlphabetic(c)) {
		c++;
	}
		res=res+c;
	}
	res=res+token;
	int j=1;
	for(int i=0;i<res.length();i++)
	{
		if(j%3==0)
		{
			ans=ans+'X';
			j++;
			continue;
		}
		j++;
		ans=ans+res.charAt(i);
	}
	return ans;
}
}