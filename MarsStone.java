package slk;

import java.util.ArrayList;
import java.util.List;

public class MarsStone {
	public static int maxUniqueStone(int input1, int input2, int[] input3) {
		int sum = input1;
		int max = Integer.MIN_VALUE;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < input3.length; i++)
		{
			l.add(input3[i]);
		}
		for (int i = 1; i <= input1; i++)
		{
			sum = sum - i;
			int count = 0;
			if (!l.contains(i))
			{
				for (int j = i + 1; j <= input1; j++)
				{
					if (!l.contains(j) && (sum - j) >= 0)
					{
						sum = sum - j;
						count++;
					}
				}
				max = Math.max(count, max);
			}
		}
		return max + 1;
	}
	public static void main(String[] args) {
	    int i1=14;
        int i2=4;
        int i3[]= {4,6,8,9};
       System.out.print(maxUniqueStone(i1,i2,i3));
	}
}
