package slk;

public class WeddingGame {
	static int minimumSets(String input1, int input2,int input3)
	{
	    int cnt = 0;
	    int num = 0;
	 
	    boolean f = false;
	    for (int i = 0; i < input2; i++) {
	        num = num * 10 + (input1.charAt(i) - '0');
	        if (num <= input3)
	            f = true;
	        else
	        {
	            if (f)
	            cnt += 1;
	            num = input1.charAt(i) - '0';
	            f = false;
	            if (num <= input3)
	                f = true;
	            else
	                num = 0;
	        }
	    }
	    if (f == true)
	        cnt += 1;
	    return cnt;
	}
	public static void main(String args[])
	{
	    String s = "1234";
	    int y = 4;
	    System.out.println(minimumSets(s,4,y));
	}
}
