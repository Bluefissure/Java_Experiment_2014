package Experiment03;
import java.util.*;

class BankAccount
{
	Scanner in= new Scanner(System.in);
	String name="",password="";
	double interest;
	int ID=0;
	double balance=0;
	void setName(String s){name=s;}
	void setID(int i){ID=i;}
	void setPassword(String s){password=s;}
	void deposit(double money){balance+=money;}
	void Withdraw(double money){balance-=money;}
	void Plusinterest(double m){interest+=m;}
	
	void Information()
	{
		String s="";
		Integer id=ID;
//		Integer id=new Integer(ID);
		for(int i=1;i<=8-id.toString().length();i++)
			s+="0";
		System.out.println("Your information:");
		System.out.println("\tName:"+name);
		System.out.println("\tID:"+s+ID);
		System.out.println("\tBalance:"+balance);
		System.out.println("\tinterest:"+interest);
//		System.out.println("Press Enter to continue.");
		in.nextLine();
	}
}
	



public class Experiment03_1 {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Random rand=new Random();
		int tot=0;
		BankAccount []cus=new BankAccount[1001];
//		BankAccount cuss=new BankAccount();
		
		System.out.println("Welcome to the ZYP's BANK System.");
		in.nextLine();
		while(true)
		{
			System.out.println("Please select what you want to do:");
			System.out.println("1.Rigister");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			int i=in.nextInt();
			in.nextLine();
			if(i==3) break;
			switch(i)
			{
				case 1:
				{
					tot++;
					cus[tot]=new BankAccount();
					System.out.println("Please input your name:");
					cus[tot].setName(in.nextLine());
					cus[tot].setID(tot);
					String p="null",pp="";
					do
					{
						System.out.println("Please input your password:");
						p=in.nextLine();
						System.out.println("Please varify your password:");
						pp=in.nextLine();
						if(p.compareTo(pp)!=0)
							System.out.println("You entered two different passwords.");
					}while(p.compareTo(pp)!=0);
					
					cus[tot].setPassword(p);
					
					System.out.println("Registered Successfully!");
					
					cus[tot].Information();
//					System.out.println("Press Enter to continue.");
//					in.nextLine();
					break;
				}
				
				case 2:
				{
					System.out.println("Please input your ID:");
					int k=in.nextInt();in.nextLine();
					if(k>tot||k<=0)
					{
						System.out.println("Wrong ID!");
						in.nextLine();
						break;
					}
					System.out.println("Please input your Password:");
					String pwd=in.nextLine();
					if(pwd.compareTo(cus[k].password)!=0)
					{
						System.out.println("Wrong Password!");
//						System.out.println("Press Enter to continue.");
						in.nextLine();
						break;
					}
					System.out.println("Login Successfully!");
//					System.out.println("Press Enter to continue.");
					in.nextLine();
					
					while(true)
					{
						System.out.println("Please select what you want to do:");
						System.out.println("1.deposit Money");
						System.out.println("2.Whithdraw Mongey");
						System.out.println("3.Inquire Balance");
						System.out.println("4.Plus interest");
						System.out.println("5.Logout");
						int j=in.nextInt();
						if(j==5) break;
						
						switch (j)
						{
							case 1:
							{
//								System.out.println("Please input the money you want to deposit:");
//								double money=in.nextDouble();
								System.out.println("Please input the max money you want to save:");
								double lim=in.nextDouble();
								double money=rand.nextDouble()*lim;
								cus[k].deposit(money);
								break;
							}
							case 2:
							{
//								System.out.println("Please input the money you want to withdraw:");
//								double money=in.nextDouble();
								System.out.println("Please input the max money you want to withdraw:");
								double lim=in.nextDouble();
								double money=rand.nextDouble()*lim;
								if(cus[k].balance-money>=0)
									cus[k].balance-=money;
								else 
								{
									System.out.println("You do not have enough balance!");
									in.nextLine();
									
								}
								break;
							}
							case 3:
							{
								System.out.println("Your balance is:"+cus[k].balance);
								in.nextLine();in.nextLine();
								break;
							}
							case 4:
							{
//								System.out.println("Please input the interest you want to plus:");
//								double inte=in.nextDouble();
								System.out.println("The interest will be added between between 0 and 1 randomly.");
								double inte=rand.nextDouble();
								cus[k].interest+=inte;
								in.nextLine();
								break;
							}
						}
						if(j!=3)
							cus[k].Information();
					}
					
					break;
				}
				
			}
		}
	}

}
