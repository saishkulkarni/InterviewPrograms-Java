package slk;

public class LastModified {
	public static int lastModified(int input1,int[] input2)
	{
		if (input2[input1 - 1] < 9) {
			return input1;
		} else {
			int index = input1;
			while (index > 0 && input2[index - 1] == 9) {
				index--;
			}
			return index;
		}
	}
	public static void main(String[] args) {
		int[] a= {1,3,5,9,1};
		int b=5;
		System.out.println(lastModified(b,a));
	}
}
