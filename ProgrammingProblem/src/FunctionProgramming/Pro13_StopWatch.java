package FunctionProgramming;

import java.util.Scanner;

public class Pro13_StopWatch 
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("press any button to start and end");
		sc.next();
		stopwatchSimulator();

	}
	public static void stopwatchSimulator()
	{
		long startTime = System.currentTimeMillis();
		System.out.println("press any button to start and end");
		sc.next();
		long stopTime= System.currentTimeMillis();
		long time= stopTime- startTime;
		System.out.println("total time required "+time+" millisecond");
		System.out.println("total time required "+time/1000+" second");
		
	}


	

}
