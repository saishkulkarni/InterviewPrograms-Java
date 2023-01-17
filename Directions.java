package kumaran;

public class Directions {

	public static void solution (String S)
	{
		int vertical=0;
		int horizontle=0;
		String ver="";
		String hor="";
		for(int i=0;i<S.length();i++)
		{
			char c=S.charAt(i);
			if(c=='N')
			{
				vertical+=1;
			}
			else if(c=='S')
			{
				vertical-=1;
			}
			else if(c=='E')
			{
				horizontle+=1;
			}
			else if(c=='W')
			{
				horizontle-=1;
			}
		}
		if(vertical==0 && horizontle==0)
		{
			System.out.println("Sad Alice");
		}
		if(vertical>0)
		{
		for(int i=1;i<=vertical;i++)
		{
			ver=ver+"N";
		}
		}
		else {
			for(int i=vertical;i<0;i++)
			{
				ver=ver+"S";
			}
		}
		if(horizontle>0)
		{
		for(int i=1;i<horizontle;i++)
		{
			hor=hor+"E";
		}
		}
		else {
			for(int i=horizontle;i<0;i++)
			{
				hor=hor+"W";
			}
		}
		System.out.println(ver+hor);
	}
	
	public static void main(String[] args) {
	String s="NWSSEWSNWSSNNEEWS";
	solution(s);
}
}
