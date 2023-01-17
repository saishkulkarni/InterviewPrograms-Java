package infosys;

import java.util.HashMap;
import java.util.Scanner;

public class InterestingString {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		System.out.print(ans(s));
		sc.close();
	}

	static int ans(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), (int)map.getOrDefault(s.charAt(i), 1) + 1);
			}
		}
		int key = 100000;
		int val = 0;
		for (int i = 0; i < s.length(); i++) {
			if (key > (int)map.get(s.charAt(i))) {
				val = (int)map.get(s.charAt(i));
				key = (int)map.get(s.charAt(i));
			}
		}
		return val;
	}
}
