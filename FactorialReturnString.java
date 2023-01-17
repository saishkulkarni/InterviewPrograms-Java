package ninestars;

public class FactorialReturnString {

	public static String factorial(int input1)
	{
		int fact=1;
		for(int i=input1;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact+"";
	}
	
	public static void main(String[] args) {
	int input1=5;
	System.out.println(factorial(input1));
}
}
