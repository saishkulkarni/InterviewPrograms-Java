package kumaran;

import java.util.Scanner;

public class BhuvanAndNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		String num1Max=s1[0].replace('5', '6');
		String num2Max=s1[1].replace('5', '6');
		String num1Min=s1[0].replace('6', '5');
		String num2Min=s1[1].replace('6', '5');
		
		int max=Integer.parseInt(num1Max)+Integer.parseInt(num2Max);
		int min=Integer.parseInt(num1Min)+Integer.parseInt(num2Min);
		
		System.out.println(min + " "+max);
		sc.close();
}
}
