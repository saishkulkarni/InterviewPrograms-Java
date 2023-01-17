package infosys;

import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class StringPartition {

	public static int getMaxPower(int N, String S) {
		int power = 0;
		HashSet<String> set = new HashSet<>();
		if (checkPallindrome(S)) {
			power =S.length() * S.length();
		} else {
			for (int i = 0; i < S.length() - 1; i++) {
				for (int j = i + 1; j <= S.length(); j++) {
					String s = S.subSequence(i, j) + "";
					if (checkPallindrome(s)) {
						set.add(s);
					}
				}
			}
		}
		List<String> words = new Vector<>();
		int max = 0;
		for (String word : set) {
			if (word.length() >= max) {
				max = word.length();
				words.add(word);
			} else {
				words.add(0, word);
			}
		}

		int count = 0;
		for (int i = words.size() - 1; i >= 0; i--) {
			if (count + words.get(i).length() <= N) {
				count = count + words.get(i).length();
				power = power + words.get(i).length() * words.get(i).length();
			}
		}

		return power;
	}

	static boolean checkPallindrome(String S) {
		boolean flag = false;
		String rev = "";
		for (int i = S.length() - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);
		}
		if (S.equals(rev)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		int N = 7;
		String S = "aabaccc";
		System.out.println(getMaxPower(N, S));
	}
}
