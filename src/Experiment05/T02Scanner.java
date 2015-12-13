package Experiment05;

import java.io.File;
import java.util.Scanner;
public class T02Scanner {
	public static void main(String args[]) throws Exception {

//		String filename = "D:\\data.txt";
		String filename = "data.txt";
		int op1,op2,result=0;
		String operator ="";
		// create a scanner from the data file
		Scanner scanner = new Scanner(new File(filename));

		// 重复从文件中读取数据
		while (scanner.hasNext()) {
			// retrieve each data element
			operator = scanner.next();
			op1 = scanner.nextInt();
			op2 = scanner.nextInt();
			
			if (operator.equals("+"))
				result = op1 + op2;
			else if (operator.equals("-"))
				result = op1 - op2;
			System.out.println(op1+" "+operator+" "+op2+" = " + result);
//			System.out.println("result is " + result);
		}
		
		scanner.close(); // also closes the File
	}
}
