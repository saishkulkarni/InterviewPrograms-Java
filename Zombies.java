package slk;

public class Zombies {
	
	public static int find(int[] input1,int input2)
	{
		for (int i = 0; i < input1.length - 1; i++) {
	            if (input1[i] > input1[i + 1] && divisor(input1[i], input1[i + 1])) {
	                return i;
	            }
		}
	            return -1;       
	}
		
	public static boolean divisor(int a, int b) {
	        int gcd = 1;
	        for (int i = 1; i <= a && i <= b; i++) {
	            if (a % i == 0 && b % i == 0) {
	                gcd = i;
	            }
	        }
	        return gcd <= 1;
    }
	
    public static void main(String[] args) {  
        int num = 6;
        int[] array = {1,1,3,6,7,3};
        System.out.println( find(array,num));
    }
}
