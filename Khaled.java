package infosys;

import java.util.Scanner;

public class Khaled {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final int N = 120, M = 1 << 20;
		int dp[] = new int[M];
		char res[] = new char[M];

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i = 1; i < M; i++)
			dp[i] = Integer.MAX_VALUE;

		for (int i = 0; i < n; ++i) {
			if (arr[i] == 0)
				continue;
			for (int j = 0; j < M; ++j)
				res[j] = 0;

			for (int k = 0; k < M; ++k) {
				if (res[k] == 1)
					continue;
				if (dp[k] > dp[k ^ arr[i]])
					dp[k] = dp[k ^ arr[i]] + 1;

				else if (dp[k ^ arr[i]] > dp[k])
					dp[k ^ arr[i]] = dp[k] + 1;

				res[k ^ arr[i]] = 1;
			}
		}

		int j = M - 1, k = n >> 1;
		while (dp[j] > k)
			--j;
		System.out.println(j);
		sc.close();
	}
}
