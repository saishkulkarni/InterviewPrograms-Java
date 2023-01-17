package general;

import java.util.Arrays;

public class ShinyIceCream 
{
static void findMinimumMaximum(int[] arr)
{
	Arrays.sort(arr);
	System.out.println(arr[0]);
	System.out.println(arr[arr.length-1]);
}
public static void main(String[] args) {
	int[] arr= {1,7,6,9,8,3,5};
	findMinimumMaximum(arr);
}
}
