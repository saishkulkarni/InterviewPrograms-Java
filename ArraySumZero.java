package motorola;

public class ArraySumZero {
public int[] solution(int N)
{
	int[] arr=new int[N];
	for(int i=0;i<N/2;i++) {
		arr[i]=i+1;
	}
	for(int i=N/2;i<N;i++)
	{
		arr[i]=-(N-i);
	}
	if(N%2!=0)
	{
		arr[N/2]=0;
	}
	
	return arr;
}
public static void main(String[] args) {
	{
		int n=16;
		ArraySumZero arraySumZero=new ArraySumZero();
		int[] arr=arraySumZero.solution(n);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}
}
