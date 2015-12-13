package Experiment04;
import java.util.*;
import java.io.*;

public class Experiment04_1 {
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		String str;
		System.out.println("Please input a direction:");
		while(in.hasNext())
		{
			
			str=in.nextLine();
			if(str.toCharArray()[0]=='W'||str.toCharArray()[0]=='w')
				System.out.println("Up");
			else if(str.toCharArray()[0]=='A'||str.toCharArray()[0]=='a')
				System.out.println("Left");
			else if(str.toCharArray()[0]=='S'||str.toCharArray()[0]=='s')
				System.out.println("Down");
			else if(str.toCharArray()[0]=='D'||str.toCharArray()[0]=='d')
				System.out.println("Right");
			else
			{
				System.out.println("Wrong Input!");
			}
			System.out.println("Please input a direction:");
		}
	}
}
