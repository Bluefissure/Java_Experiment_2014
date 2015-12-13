package Experiment06;

import java.util.Random;
import java.util.Scanner;
import java.text.Format;
import java.text.NumberFormat;
import java.io.*;
public class T03StringProc_4 {
	public static void main(String[] args) throws Exception {
	for(int u=1;u<=10;u++)
	{
		String filename = "data"+u+".txt";
		Scanner scanner = new Scanner(new File(filename));
		String str=scanner.nextLine();
		
		

//		String str="test";
		int count = 0; 
		for (int i = 0; i< str.length(); i++){	
			if (str.charAt(i) == 's'){
				count++;
			}			
		}
		System.out.println("In "+filename+", percentage of 's' is " + (double)count/str.length());
//		Format fmt1=NumberFormat.getPercentInstance();
//		System.out.println("percentage of 's' is " + fmt1.format((double)count/str.length()));
		
		int tot=0;
		count = 0; 
		final int MAX=10000;
		Random rand=new Random();
		for (int i = 0; tot<=MAX; i=(int)(rand.nextInt(str.length()))){	
			tot++;
			if (str.charAt(i) == 's'){
				count++;
			}			
		}
		System.out.println("In "+filename+", percentage of 's' is about " + (double)count/tot+"\n");
		
		
		
//		String str="test";
		 count = 0; 
		for (int i = 0; i< str.length(); i++){	
			if (str.charAt(i) == 'z'){
				count++;
			}			
		}
		System.out.println("In "+filename+", percentage of 'z' is " + (double)count/str.length());
//		Format fmt1=NumberFormat.getPercentInstance();
//		System.out.println("percentage of 's' is " + fmt1.format((double)count/str.length()));
		
		 tot=0;
		count = 0; 
		for (int i = 0; tot<=MAX; i=(int)(rand.nextInt(str.length()))){	
			tot++;
			if (str.charAt(i) == 'z'){
				count++;
			}			
		}
		System.out.println("In "+filename+", percentage of 'z' is about " + (double)count/tot+"\n");
		
		
		
	}
	}
}
