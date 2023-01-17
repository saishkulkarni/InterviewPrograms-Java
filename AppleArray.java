package general;

import java.util.Arrays;

public class AppleArray {
	public static long appleAndCoupon(int n, int m, int[] arr) {
		long sum = 0;
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			if(i==m-1)
			{
				continue;
			}
			
			if(i==m-2 && (arr[m-2]==arr[m-1]))
			{
				continue;
			}
			
			sum=sum+arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 1, 3 };
		System.out.println(appleAndCoupon(5, 3, arr));
	}
}
