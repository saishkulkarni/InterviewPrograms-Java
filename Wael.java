package infosys;

import java.util.Scanner;

public class Wael {
	 public static void main (String[]args)
	  {

	    Scanner sc = new Scanner (System.in);
	    int n = sc.nextInt ();
	    int k = sc.nextInt ();
	    int arr[] = new int[n];

	    for (int i = 0; i < n; i++)
	        arr[i] = sc.nextInt ();

	    int res = 0, max = Integer.MIN_VALUE;

	    for (int i = 0; i <= k; i++)
	      {
	          res = 0;
	          for (int j = 0; j < n; j++)
	          res = res + (i ^ arr[j]);
	          max = Math.max (res, max);
	      }
	    System.out.println (max);
	    sc.close();
	  }
}
