package vinnovate_labs;

public class SteveString {
	
	public static String remove(String s)
	{
		StringBuffer buffer=new StringBuffer(s);
		int i=0;
		String res="";
		while(i<buffer.length())
			{
			if(buffer.charAt(i)==buffer.charAt(i+1))
			{
				buffer.deleteCharAt(i);
				buffer.deleteCharAt(i);
			}
			i++;
		}
		if(!buffer.equals(""))
		{
			for(int j=0;j<buffer.length()-1;j++)
			{
				if(buffer.charAt(j)==buffer.charAt(j+1))
				{
				buffer.deleteCharAt(j);
				buffer.deleteCharAt(j);
				}
			}
		}
		res=buffer.toString();
		return res;
	}
	
	public static void main(String[] args) {
	String a="aa";
	System.out.println(remove(a));
}
}
