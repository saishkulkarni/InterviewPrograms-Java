package vinnovate_labs;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayFrequency {

	public static void countFreq(int arr[], int n)
	{
	    boolean visited[] = new boolean[n];
	    HashMap<Integer, Integer> map=new HashMap<>();
	     
	    Arrays.fill(visited, false);
	 
	    for (int i = 0; i < n; i++) {
	 
	        if (visited[i] == true)
	            continue;
	 
	        // Count frequency
	        int count = 1;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] == arr[j]) {
	                visited[j] = true;
	                count++;
	            }
	        }
	        map.put(arr[i], count);
	    }
	   
	}
	 
	public static void main(String []args)
	{
	    int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
	    int n = arr.length;
	    countFreq(arr, n);
	}
	}
