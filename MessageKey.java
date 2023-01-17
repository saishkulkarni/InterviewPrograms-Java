package general;

public class MessageKey {
	
	public static void simple(String message,int key)
	{
		String k="";
		String val="";
		while(key>0)
		{
			k=k+key%10;
			key=key/10;
		}
		
		for(int i=k.length()-1;i>=0;i--)
		{
			val=val+k.charAt(i);
		}
		
		String mes=message.toUpperCase();
		for(int i=0;i<message.length();i++)
		{
			int a=(int)mes.charAt(i)-64;
			int b=Integer.parseInt(val.charAt(i)+"");
			System.out.print((a+b));
			if(i<message.length()-1)
			{
				System.out.print(",");
			}
		}
	}
	
public static void main(String[] args) {
	String message="start";
	int key=13571;
	simple(message, key);
}
}
