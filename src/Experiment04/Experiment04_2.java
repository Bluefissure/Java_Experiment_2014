package Experiment04;

import java.util.*;

public class Experiment04_2 {
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		Random rand=new Random();
		int num;
		int guess;
		boolean f=true;
		while(f)
		{
			num=rand.nextInt(1000)+1;
			guess=-1;
			int time=0;
			while(guess!=num)
			{
				System.out.println("Please guess a number:");
				guess=in.nextInt();
				time++;
				if(guess>num)
					System.out.println("The number you guessed is larger than the answer.");
				else if(guess<num)
					System.out.println("The number you guessed is smaller than the answer.");
				else if(guess==num)
				{
					System.out.println("You won!!\nYou've guessed "+time+" times.");
					in.nextLine();
				}
			}
			
			
			System.out.println("Would you play again?\n1.Yes\n2.No\n");
			f=(in.nextInt()==1);
		}
		
	}
}
