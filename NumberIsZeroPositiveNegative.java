package general;

import java.util.Scanner;

public class NumberIsZeroPositiveNegative {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int pos=0;
	int neg=0;
	int zero=0;
	
	boolean flag=true;
	while(flag)
	{
		System.out.println("Enter the number : ");
		int a=scanner.nextInt();
		if(a>0)
		{
			pos++;
		}
		else if(a==0)
		{
			zero++;
		}
		else {
			neg++;
		}
		System.out.println("Do You want to add more elements(Y/N): ");
		String val=scanner.next();
		if(!val.equalsIgnoreCase("Y"))
		{
			flag=false;
		}
	}
	System.out.println("Positive Numbers Count is: "+pos);

	System.out.println("Negative Numbers Count is: "+neg);

	System.out.println("Zero Count is: "+zero);
	scanner.close();
}
}
