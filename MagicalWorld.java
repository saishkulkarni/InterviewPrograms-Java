package kumaran;

public class MagicalWorld {
public static String Solution(String S,String T)
{
	String s=S.toUpperCase();
	String t=T.toUpperCase();
	int num1=1;
	int num2=1;
	for(int i=0;i<s.length();i++)
	{
		num1*=(int)s.charAt(i)-64;
	}
	for(int i=0;i<t.length();i++)
	{
		num2*=(int)t.charAt(i)-64;
	}
	
	if(num1%47==num2%47)
	{
		return "CHOSEN";
	}
	else
	{
		return "NOT CHOSEN";
	}
	
}
public static void main(String[] args) {
	String s1="A";
	String s2="Z";
	System.out.println( Solution(s1, s2));
	
}
}
