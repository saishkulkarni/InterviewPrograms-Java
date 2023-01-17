package infosys;

import java.util.Arrays;
import java.util.Scanner;

public class AndyLocation {
	public static void main (String[]args)
	  {

	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt ();
	    int m = sc.nextInt ();
	    int k = sc.nextInt ();

	    int arr[] = new int[n];

	    for (int i = 0; i < m; i++) arr[i] = sc.nextInt (); int ans = 0; Arrays.sort (arr); if (k > 0)
	      {
		for (int i = k + 1; i <= m + 2; i++)
		  ans = Math.max (ans, arr[i] - arr[i - k - 1] - 1);
	      }
	    else
	      {
	          int j = 0;
	          while (arr[j] == 0)
	          j++;
	          int count = 0;
	          
	          for (int i = 1; i <= n; i++)
	          {
	              count++;
	              if (j < n && (i == arr[j]))
	              {
	                  count = 0;
	                  j++;
	              }
	              ans = Math.max (count, ans);
	              
	          }
	      }
	    System.out.println (ans);
	    sc.close();
	    }
}
