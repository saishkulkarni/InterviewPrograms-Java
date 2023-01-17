package kumaran;

import java.util.Scanner;

public class SimpleStarandHash {

	    public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	    	int k,i,j;
	        int n=scanner.nextInt();
	        int sc,hc;
	        sc=1;
	        hc=n-1;
	        for(k=0;k<n;k++)
	        {
	                for(i=1;i<=sc;i++)
	                {
	                    System.out.print("*");
	                }
	                for(j=1;j<=hc;j++)
	                {
	                 System.out.print("#");
	                }
	             System.out.print("\n");
	            sc++;
	            hc--;
	        }
	    }
	}
