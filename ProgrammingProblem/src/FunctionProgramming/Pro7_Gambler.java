package FunctionProgramming;

import java.util.Scanner;

public class Pro7_Gambler {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Cash Amount");
		        int stake  =sc.nextInt();  // gambler's stating bankroll
		        System.out.println("Enter how much money you want earn goal");
		        int goal   =sc.nextInt();     // gambler's desired bankroll
		        System.out.println("Enter number of trials");
		        int trials =sc.nextInt();     // number of trials to perform

		        int bets = 0;        // total number of bets made
		        int wins = 0;        // total number of games won
		        double percentWon;

		        // repeat trials times
		        for (int t = 0; t < trials; t++) 
		        {

		            // do one gambler's ruin simulation
		            int cash = stake;
		            while (cash > 0 && cash < goal) 
		            {
		                bets++;
		                if (Math.random() < 0.5) 
		                	cash++;     // win $1
		                else                     
		                	cash--;     // lose $1
		            }
		            if (cash == goal) 
		            	wins++;                // did gambler go achieve desired goal?
		        }

		        // print results
		        System.out.println(wins + " wins of " + trials);
		        percentWon= (100.0 * wins / trials);
		        System.out.println("Percent of games won = " + percentWon);
		        double percentLoss = (100.0-percentWon);
		        System.out.println("Percent of games loss = " + percentLoss);
		        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		    


	}

}
