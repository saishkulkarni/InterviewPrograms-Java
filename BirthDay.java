package infosys;

import java.util.Scanner;

public class BirthDay {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k, n;
		n = sc.nextInt();
		k = sc.nextInt();
		System.out.println(countt(n, k));
		sc.close();
	}

	static int counter(int n, int k) {
		int count = 0;
		if (k == 1)
			return n;
		else {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j % i == 0)
						count++;
				}
			}
		}
		return count;
	}

	static int countt(int n, int k) {
		if (k == 1)
			return n;
		if (k == 2) {
			return counter(n, k);
		}
		int mid = k / 2;
		int x = countt(n, k - mid);
		int y = counter(n, mid);
		return x + y - 1;
	}
}
