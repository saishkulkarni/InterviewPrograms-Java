package general;

public class LockerCircle {

	public static int maxLoot(int[] hval,int n)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			return hval[0];
		}
		int pick =hval[n]+maxLoot(hval, n-2);
		
		int notPick=maxLoot(hval, n-1);
		System.out.println(pick);
		System.out.println(notPick);
		return Math.max(pick, notPick);
	}
	
	public static void main(String[] args) {
	int hval[]= {1000,2000,3000,5000,9000,7000,6000,4000,7000,5000};
	int n=hval.length;
	System.out.println("Max : "+maxLoot(hval, n-1));
}
}
