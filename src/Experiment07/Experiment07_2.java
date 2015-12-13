package Experiment07;
import java.util.*;
public class Experiment07_2{

	static int Zeller(int y,int m,int d)
	{
		
		int c=y/100;
		y%=100;
		int w=c/4-2*c+y+y/4+(13*(m+1)/5)+d-1;
		return w%7;
	}
	static int maxdays(int month,int year)
	{
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
		return maxd;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Please input the month and year:");
		int month=scan.nextInt();
		int year=scan.nextInt();
		
		int maxd=0,maxdp;
		maxd=maxdays(month,year);
		if(month<12)
			maxdp=maxdays(month+1,year);
		else
			maxdp=maxdays(1,year+1);
		System.out.print("Sun.\tMon.\tTues.\tWed.\tThurs.\tFri.\tSat.\t\t");
		System.out.println("Sun.\tMon.\tTues.\tWed.\tThurs.\tFri.\tSat.");
//		System.out.println("maxd is "+maxd);
		int begin=Zeller(year,month,1);
		int beginp=(begin+maxd)%7;
		int i,j,p=1,pp=1,d1=1,d2=1;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=14;j++)
			{
				if(j<=7)
				{
					int temp=j+(i-1)*7;
					if(temp<=begin)
						System.out.print("\t");
					else
					{
						if(p<=maxd)
							System.out.print(p+"\t");
						else
							System.out.print("\t");
						p++;
					}
					if(j==7) System.out.print("\t");
				}
				else
				{
					int temp=(j-7)+(i-1)*7;
					if(temp<=beginp)
						System.out.print("\t");
					else
					{
						if(pp<=maxdp)
						System.out.print(pp+"\t");
						else
							System.out.print("\t");
						pp++;
					}
					if(j==14)
						System.out.println();
				}
			}
			
		}
		
	}

}
