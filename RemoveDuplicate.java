package general;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] a= {1,2,3,3,4};
	int[] b=new int[a.length];
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
			}
			else {
				b[i]=a[i];
			}
		}
	}
	for(int k=0;k<b.length;k++)
	{
	System.out.println(b[k]);
	}
}
}
