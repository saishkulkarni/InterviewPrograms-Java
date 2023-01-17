package general;

public class MaxLengthofAdjacentChar {

	public static int findAnswer(String x) {
		char[] arr = x.toCharArray();
		int max = 0;
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {

				if (count >= max) {
					max = count;
				}
			} else {
				count = 1;
			}

		}

		return max;
	}

	public static void main(String[] args) {
		String x = "cabbcccddbbx";
		System.out.println(findAnswer(x));
	}

}
