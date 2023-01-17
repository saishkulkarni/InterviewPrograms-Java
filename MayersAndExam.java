package slk;

public class MayersAndExam {
	public static int mainMarks(int input1, int[] input2) {
		int sum = 0;
		for (int i = 0; i < input1; i++) {
			for (int j = i + 1; j < input1; j++) {
				if (input2[i] == input2[j]) {
					int[] count = new int[] { 1 };
					input2[i] = input2[i] + count[0];
				}
			}
		}
		for (int i = 0; i < input1; i++) {
			sum = sum + input2[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int a=5;
		int[] x= {1,2,3,4,5}; 
		System.out.println(mainMarks(a, x));
	}
}
