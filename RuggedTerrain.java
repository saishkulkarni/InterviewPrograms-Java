package infosys;

import java.util.Scanner;

public class RuggedTerrain {
	public static void main(String[] args)
	{
	    
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] a = new int[n];
	    for(int i =0; i< n; i++)
	    {
	        a[i] = s.nextInt();
	    }
	        int max_dig = 0;
	        for(int i =0; i< n-1; i++)
	        {
	            if(a[i]<=a[i+1])
	            {
	                max_dig = Math.max(max_dig,(a[i+1]-a[i]+1));
	                a[i+1] = a[i] -1;
	            }
	        }
	        int ans = (int)Math.sqrt(max_dig);
	        System.out.println(ans);
	        s.close();
	}
}
