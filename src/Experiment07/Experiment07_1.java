package Experiment07;
import java.util.*;
public class Experiment07_1 {

	static int Zeller(int y,int m,int d)
	{
		
		int c=y/100;
		y%=100;
		int w=c/4-2*c+y+y/4+(13*(m+1)/5)+d-1;
		return w%7;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input the month and year:");
		int month=scan.nextInt();
		int year=scan.nextInt();
		
		int maxd=0;
		boolean f=false;
		if(year%400==0||(year%100!=0&&year%4==0))
		{
					f=true;
		}
		switch(month)
		{
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			{maxd=31;break;}
		case 4:case 6:case 9:case 11:
			{maxd=30;break;}
		case 2:
			{maxd=f?29:28;break;}
		}
		System.out.println("Sun.\tMon.\tTues.\tWed.\tThurs.\tFri.\tSat.");
		int begin=Zeller(year,month,1);
//		System.out.print(begin);
//		scan.nextLine();
		int p=1;
		for(int j=1;j<=begin;j++){
			System.out.print("\t");p++;}
		
		for(int i=1;i<=maxd;i++)
		{
			
			System.out.print(i);
			if(p++%7==0)
				System.out.println();
			else System.out.print("\t");
		}

	}

}
