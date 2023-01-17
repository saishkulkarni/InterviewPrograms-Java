package general;

public class CalculateSteps {

	static int calculate_steps(int total_length,int distance_to_reach)
	{
		int steps=0;
		int pos=0;
		int i=1;
		while(i<distance_to_reach)
		{
		      int j = pos + i;
		      pos=i;
		      i = j;
		      steps++;
		}
		
		return steps;
	}
	
	public static void main(String[] args) 
	{
		int total_length=4;
		int distance_to_reach=2;
		System.out.println(calculate_steps(total_length, distance_to_reach));
	}
}
