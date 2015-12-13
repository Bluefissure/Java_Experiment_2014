package Experiment02;
import java.util.*;
public class Experiment02_1 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
		System.out.println("Please input a decimal number:");
		int n=in.nextInt();
		String s="";
		while(n>0)
		{
			s=(char)(n%8+'0')+s;
			n/=8;
		}
		System.out.println("The octal number is:\n"+s);
	}
}
