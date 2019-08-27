package com.brideglabz.functionprogramming;

import com.bridgelabz.utility.ScannerInput;
import com.bridgelabz.utility.Utility;

public class Pro7_Gambler {
	public static void main(String[] args) 
	{
			System.out.println("Enter Cash Amount");
		        int stake  =ScannerInput.intInput();  
		        System.out.println("Enter how much money you want earn goal");
		        int goal   =ScannerInput.intInput();     
		        System.out.println("Enter number of trials");
		        int trials =ScannerInput.intInput();    
		        
		     int[] game=   Utility.gambler(stake, goal, trials);
		     int wins=game[0];
		     int bets=game[1];
		        // print results
		        System.out.println(wins + " wins of " + trials);
		        double percentWon= (100.0 * wins / trials);
		        System.out.println("Percent of games won = " + percentWon);
		        double percentLoss = (100.0-percentWon);
		        System.out.println("Percent of games loss = " + percentLoss);
		        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		    


	}

}
