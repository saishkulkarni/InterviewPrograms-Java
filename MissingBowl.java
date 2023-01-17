package slk;

public class MissingBowl {

	   public static int MissingMarbles(int input1, int[] input2)
       {
           int sum = input2[0] + input2[input1 - 1];
           int missing = 0;
           int i = 1, j = input1 - 2;
           while(i<=j)
           {
        	   if(input2[i]+input2[j] == sum)
               {  
                   i++;  
                   j = j - 1;  
               }
               else  
               {
                   if (i == j)  
                       missing = sum - input2[i];
                   else
                   missing = (sum - (input2[i] + input2[j]));
                   break;
               }
           }
           return missing;
       }
	
	public static void main(String[] args) {
	int a=5;
	int[] b= {1,3,5,9,11};
	System.out.println(MissingMarbles(a, b));
}
}
