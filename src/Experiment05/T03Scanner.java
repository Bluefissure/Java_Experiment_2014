package Experiment05;

import java.io.File;
import java.util.*;

public class T03Scanner {
	public static void main(String args[]) throws Exception {

		String filename = "datalll.txt";
		int op1, op2, result = 0, i;
		String operator = "";
		// create a scanner from the data file
		Scanner scanner = new Scanner(new File(filename));
		final int maxn = 10000;
		int a[] = new int[maxn];
		char op[] = new char[maxn];
		int lengtha = 0, lengthop = 0;
		while (scanner.hasNext()) {

			lengtha = 0;
			lengthop = 0;

			String strr, str;
			strr = scanner.nextLine();
			Scanner scan = new Scanner(strr);
			while (scan.hasNext()) {
				str = scan.next();
				if (Character.isDigit(str.charAt(0))) {
					a[lengtha++] = Integer.parseInt(str);
				} else {
					if (str.equals("+") || str.equals("-"))
						op[lengthop++] = str.charAt(0);
					else {
						if (str.equals("*"))
							a[lengtha - 1] *= scan.nextInt();
						else if (str.equals("/"))
							a[lengtha - 1] /= scan.nextInt();
					}
				}

			}
			result = a[0];
			for (i = 0; i < lengthop; i++) {
				if (op[i] == ('+'))
					result += a[i + 1];
				else
					result -= a[i + 1];
			}

			System.out.println("The answer is\n"+result);
		}
		scanner.close(); // also closes the File
	}
}
