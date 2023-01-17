package slk;

import java.util.HashSet;

public class SerenaFlowers {
	
	public static int SheenaFlower(int input1,int input2,int[] input3)
	{
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0 ; i<input1 ;i++)
        {
            if(i<input2)
                hs.add(input3[i]);
        }
        return hs.size();
	}
	
	public static void main(String[] args) {
		
		int a=5;
				int b=3;
				int[] x= {1,1,2,1,5};
		
		System.out.println(SheenaFlower(a, b, x));
	}

}
