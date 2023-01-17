package infosys;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BobPlays {
	public static int solve(int N, int M, List<String> words, String s) {
		int res = 0;
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (String word : words) {
				for (int j = 0; j < word.length(); j++) {
					if (s.charAt(i) == word.charAt(j)) {
						set.add(word);
					}
				}
			}
			
		}
		System.out.println(set);
		res = set.size();
		if(res>0)
		{
			return res * N;	
		}
		else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		int N = 3;
		int M = 5;
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("baby");

		System.out.println(solve(N, M, list, "wbadb"));
	}
}
