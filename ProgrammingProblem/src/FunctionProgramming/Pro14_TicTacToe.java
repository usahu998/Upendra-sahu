package FunctionProgramming;

import java.util.Random;
import java.util.Scanner;

public class Pro14_TicTacToe 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println(ticTacToe());
	}
	public static String ticTacToe()
	{
		boolean userTurn=false;
		int gameArray[][]=new int[3][3];
		int rows,cols;
		
		for (int i = 0; i <3; i++) 
		{
			for (int j = 0; j <3; j++)
			{
				gameArray[i][j]=-1;
			}
			
		}
		
		for (int k = 0; k <9; k++)
		{
			if(userTurn)
			{
				userTurn(gameArray);
				userTurn=false;
				printGameArray(gameArray);
				if(checkWin(gameArray,0))
				{
					return "You Won";
				}
			}
			else
			{
				System.out.println("Computer turn ");
				computerTurn(gameArray);
				userTurn=true;
				printGameArray(gameArray);
				if(checkWin(gameArray,1))
				{
					return "Computer Won";
				}
			}
		}
		return "Match Draw";
		
	}
	
	private static void printGameArray(int gameArray[][])
	{
		for (int i = 0; i <3; i++) 
		{
			for (int j = 0; j <3; j++)
			{
				if(gameArray[i][j]==0)
				{
					System.out.print("|X|");
				}
				else if(gameArray[i][j]==1)
				{
					System.out.print("|0|");
				}
				else
				{
					System.out.print("| |");
				}
			}
			System.out.println();
			System.out.println("==================================");
			
		}
	}
	
	private static void computerTurn(int gameArray[][])
	{
		Random random=new Random();
		int row=random.nextInt(3);
		int cols=random.nextInt(3);
		
		if(isValidTurn(gameArray,row,cols))
		{
			gameArray[row][cols]=1;
		}
		else
		{
			computerTurn(gameArray);
		}
	}
	
private static boolean checkWin(int gameArray[][],int i)
{
		if(gameArray[0][0]==i && gameArray[1][1]==i && gameArray[2][2]==i) 
		{
			return true;
		}
		if(gameArray[2][0]==i && gameArray[1][1]==i && gameArray[0][2]==i) 
		{
			return true;
		}
		
		for (int j = 0; j <3; j++)
		{
			if(gameArray[j][0]==i && gameArray[j][1]==i && gameArray[j][2]==i)
			{
				return true;
			}
			if(gameArray[0][j]==i && gameArray[1][j]==i && gameArray[2][j]==i)
			{
				return true;
			}
		}
		
		return false;
}
	

public static void userTurn(int gameArray[][])
{
	System.out.println("Your Turn");
	System.out.println("Enter Position");
	System.out.println("Row");
	int row=sc.nextInt()-1;
	System.out.println("column");
	int cols=sc.nextInt()-1;
	
	if(isValidTurn(gameArray,row,cols))
	{
		gameArray[row][cols]=0;
	}
	else
	{
		userTurn(gameArray);
	}
}

	private static boolean isValidTurn(int gameArray[][],int row,int cols)
	{
		if(gameArray[row][cols]==-1)
		{
			return true;
		}
		return false;
	}
}
