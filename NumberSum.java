package ninestars;

import java.util.Arrays;

public class NumberSum {
	
	public static int numberSum(int input1,int[] input2)
	{
		int sum=0;
		Arrays.sort(input2);
		sum=input2[0]+input2[input2.length-1];
		
		return sum;
	}
	
	
	public static void main(String[] args) {
	int n=7;
	int[] a= {7,2,6,15,54,10,23};
	System.out.println( numberSum(n, a));
}
}
