package general;

import java.util.Scanner;

public class FormattedNumber {
public static boolean checkNumber(String input)
{
	int count=0;
	boolean flag=false;
	for(int i=0;i<input.length();i++)
	{
		if(input.charAt(i)=='.')
		{
			count++;
		}
		
		if(Character.isDigit(input.charAt(i))||input.charAt(i)==','||input.charAt(i)=='.')
		{
		flag=true;
		}
		else
		{
			flag=false;
			break;
		}
	}
	if(count>1)
	{
		flag=false;
	}
	return flag;
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String s1=scanner.next();
	System.out.println(checkNumber(s1));
	scanner.close();
}
}
