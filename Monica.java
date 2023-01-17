package slk;

import java.util.Arrays;

public class Monica {
	
	public static int MonicaMethod(int input1,int[] input2)
	{
		 Arrays.sort(input2);
	        int res = 0, total = 0;
	        for (int i = input1 - 1; i >= 0 && input2[i] > -total; --i) {
	            total += input2[i];
	            res += total;
	        }
	        return res;
	}
	
public static void main(String[] args) {
	int[] a= {-1,3,4};
	int x=3;
	System.out.println(MonicaMethod(x, a));
}
}
