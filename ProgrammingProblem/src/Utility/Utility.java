package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;

/*
 * @Author Upendra Sahu
 * 
 * */
public class Utility {
/*===============================================================================================================*/

	public static void isToBinary(String bi)
	{
		 int bin=Integer.parseInt(bi);
		    int digit=0;
		    int rev=0;
		    int p=0;
		    int sum=0;
		    int count=0;
		    while(bin!=0)
		    {
		    	digit=bin%10;
		    	rev=digit*(int)Math.pow(2,p);
		    	if(rev!=0)
		    	{sum=sum+rev;
		    	count++;
		    		if(count==1)
		    			System.out.print(rev);
		    	else
		    			System.out.print("+"+rev);
		    	}
		    	
		    	bin=bin/10;
		    	p++;
		    }
		    
		    System.out.print(" = "+sum);
		
	}
/*===============================================================================================================*/

	
	public static float CelToFahren(int celsius)
	{
		float fahrenheit=(celsius*9/5)+32;
		return fahrenheit;
	}
	
/*===============================================================================================================*/
	
	
	public static float fahrenToCel(int fahrenheit)
	{
		float celsius=(fahrenheit-32)*5/9;
		return celsius;
	}
	
/*===============================================================================================================*/	
	public static String isDayofWeek(int dd,int mm,int yyyy)
	{
		int yy=yyyy-1;
		int days=dd;
		
		days=days+yy*365;
		
		days=days+(yy/400+yy/4-yy/100);
		
		int months[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(yyyy%400==0||yyyy%4==0&&yyyy%100!=0)
		{
			months[2]=29;
		}
		
		for (int i = 0; i < mm; i++)
		{
			days=days+months[i];
			
		}
		
		String dname[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String day=dname[days%7];
		return day;

	}
	/*===============================================================================================================*/	
	
	public static int searchYourNum(int lo, int hi)
    {
        if ((hi - lo) == 1) 
        	return lo;
        int mid = (lo+hi) / 2;
        System.out.println("Is it less than "+mid);
        boolean rs=ScannerInput.booleanInput();
        if (rs)
        	return searchYourNum(lo, mid);
        else                    
        	return searchYourNum(mid, hi);
    }
	
	/*===============================================================================================================*/
	public static double isWindChill(double temperature,double speed)
	{
		double windchill=35.74+(0.6215*temperature)+(0.4275*temperature-35.75)* Math.pow(speed, 0.16);
		return windchill;
	}
	
	
	/*===============================================================================================================*/
	
	public static double[] isQuadratic(int a,int b,int c)
	{
		double delta=Math.sqrt(b*b-(4*a*c));
		double root1=(-b+delta)/(2*a);
		double root2=(-b-delta)/(2*a);
		double root[]= {root1,root2};
		return root;
		
		
		
		
	}
	/*===============================================================================================================*/
	
	public static String ticTacToe()
	{
		boolean userTurn=false;
		int gameArray[][]=new int[3][3];
		
		
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
	int row=ScannerInput.intInput()-1;
	System.out.println("column");
	int cols=ScannerInput.intInput()-1;
	
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
	
	/*===============================================================================================================*/
	
	public static long stopwatchSimulator()
	{
		long startTime = System.currentTimeMillis();
		System.out.println("press any button to start and end");
		ScannerInput.wordInput();
		long stopTime= System.currentTimeMillis();
		long time= stopTime- startTime;
		return time;
		
	}
	/*===============================================================================================================*/
	
	public static void permutation(String perm,String word) 
	{
		if(word.isEmpty())
		{
			System.err.println(perm+word);
		}
		else
		{	for (int i = 0; i <word.length(); i++)
			{
				permutation(perm+word.charAt(i),word.substring(0, i) + word.substring(i+1,word.length()));	
			}
		}
	}      
	/*===============================================================================================================*/
	 public static int[][] isIntegerArray(int a[][])
		{
			 System.out.println("Enter Integer element");
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a.length; j++) 
				{
					a[i][j]=ScannerInput.intInput();
				}
			}
			return a;
		}
	 /*===============================================================================================================*/ 
		 public static double[][] isDoubleArray(double b[][])
			{
			 System.out.println("Enter Double Element");
				for (int i = 0; i < b.length; i++) 
				{
					for (int j = 0; j < b.length; j++) 
					{
						b[i][j]=ScannerInput.doubleInput();
					}
					
				}
				return b;
			}	
		 /*===============================================================================================================*/
		 public static String[][] isBooleanArray(String c[][])
			{
			 System.out.println("Enter Boolean Element");
				for (int i = 0; i < c.length; i++) 
				{
					for (int j = 0; j < c.length; j++) 
					{
						c[i][j]=ScannerInput.strInput();
					}
					
				}
				return c;
			}	
	
	
		 /*===============================================================================================================*/
	
	
	
	public static int[] generateCoupon(int nRandom) 
	{
		int ar[]=new int[nRandom];
		ar[0]=(int)(Math.random()*nRandom*10);
		int index=1;
		
		while(index<nRandom)
		{
			int rno=(int)(Math.random()*nRandom*10);
			boolean flag=true;
			for (int i = 0; i <index; i++)
			{
				if(ar[i]==rno)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
				ar[index++]=rno;
		}
		return ar;
	}
	
	/*===============================================================================================================*/
	
	public static int[] gambler(int stake,int goal,int trials)
	{
		int bets = 0;        
        int wins = 0;        
        double percentWon;

        // repeat trials times
        for (int t = 0; t < trials; t++) 
        {

            
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
            	wins++;                
        }
        int game[]= {wins,bets};
		return game;
	}
	
	/*===============================================================================================================*/
	public static int[] isFactors(int n)
	{int array[]=new int[n];
		for (int i = 1; i*i <=n; i++)
		{
			if(n%i==0)
			{
				array[i]=i;
			}
		}
		return array;
	}
	/*===============================================================================================================*/
	public static double isHarmonicNumber(int n)
	{ double sum=0;
		if(n!=0)
			{
				for (int i = 1; i <= n; i++)
				{
					sum=sum+(1.0/i);
					if(i==1)
					{
						System.out.print("1/"+i+" ");
					}	
				else
					{
						System.out.print(" + "+"1/"+i);
					}	
			}
			System.out.println();
			}
		return sum;
	}
	
	/*===============================================================================================================*/
	public static int powerOfTwo(int num)
	{int pow=1;
		if(0<=num && num <31)
		{
			for(int i=0;i<=num;i++)
			{
			System.out.println("2^"+i+"  "+pow);   //ans=Math.pow(2,power)
			pow=2*pow;                             //System.out.println(power+" "+ans);
			}
		}
		return pow;
	}
	/*===============================================================================================================*/
	
	public static boolean leapYear(int year)
	{
		if(year>999 && year<=9999)
		{
			if(year%400==0 || year%4==0 && year%100!=0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}

	}
	
	
	/*===============================================================================================================*/
	/*
	 * @Purpose FlipCoin
	 * 
	 * @para int number of times
	 * 
	 * @return int array
	 */
	public static int[] flipCoin(int noOfTimes) {
		int countHead = 0, countTail = 0;
		
		for (int i = 0; i < noOfTimes; i++) {
			if (Math.random() < 0.5) {
				countHead++;
			} else {
				countTail++;
			}
		}
		int c[]= {countHead,countTail};
		return c;
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose CreateIntegerArray
	 * 
	 * @para int array
	 * 
	 * @return int array
	 */
	public static int[] getIntArray(int limit) {
		int[] array = new int[limit];
		System.out.println("Enter the " + limit + " element");
		for (int i = 0; i < array.length; i++) {
			array[i] = ScannerInput.intInput();
		}
		return array;
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose isThreeSumZero
	 * 
	 * @para int array
	 * 
	 * @return int
	 */
	public static int isThreeSumZero(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						count++;
					}
				}
			}
		}
		return count;
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose replaceMsg
	 * 
	 * @para String Str1=firstName
	 * @para String regx1
	 * @para String Str2=LastName
	 * @para String regx2
	 * 
	 */

	
	static String msg = "Hello <<FirstName>> , How are you? <<LastName>>";

	public static void replaceMsg(String str1, String regx1, String str2, String regx2) {
		if (str1.length() > 2 && str2.length() > 2) {
			String[] stringArray = msg.split(" ");
			for (int i = 0; i < stringArray.length; i++) {
				if (stringArray[i].equals(regx1))
					stringArray[i] = str1;
				else if (stringArray[i].equals(regx2))
					stringArray[i] = str2;
			}
			for (int i = 0; i < stringArray.length; i++) {
				System.out.print(stringArray[i] + " ");
			}
		} else
			System.err.println("invalid minimum three character  ");
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose check Anagram
	 * 
	 * @para String s1
	 * 
	 * @para String s2
	 * 
	 * @return boolean
	 */

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) // comparing length
		{
			return false;
		} else {
			char a1[] = s1.toLowerCase().toCharArray(); // String to character Array
			char a2[] = s2.toLowerCase().toCharArray(); // String to character Array
			Arrays.sort(a1); // Arrange in ascending order
			Arrays.sort(a2); // Arrange in ascending order

			if (Arrays.equals(a1, a2)) // check both array are equal or not
				return true;
		}
		return false;
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose isPrime
	 * 
	 * @para no
	 * 
	 * @return int array
	 */

	public static int[] isPrime() {
		int k = 0;
		int a[] = new int[1000];
		int n = 0, sum = 0;
		while (++n <= 1000) {
			int count = 1, i = 1;
			while (i <= n / 2) {
				if (n % i == 0)
					count++;

				if (count > 2)
					break;
				i++;
			}

			if (count == 2) {
				// sum = sum + n;

				a[k++] = n;
				// System.out.print(n + " ");
			}

		}
		// storing in new array with new size
		int c[] = new int[k];
		for (int j = 0; j < k; j++) {
			c[j] = a[j];
		}
		return c;
		// System.out.println();
		// System.out.println("Total number of prime number upto 1 - 100 is=" + sum);
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose isBinarySearch
	 * 
	 * @para int array
	 * 
	 * @para int key
	 * 
	 * @para int low
	 * 
	 * @para int high
	 * 
	 * @return int
	 */

	public static int isBinarySearch(int a[], int key, int low, int high) {
		int mid;
		while (low <= high) {
			mid = (low + high) / 2; // find mid value

			if (key == a[mid]) {
				return mid;
			} else if (key <= a[mid]) // key is less than mid
			{
				low = low;
				high = mid - 1;
			} else if (key >= a[mid]) // key is greater than mid
			{
				low = mid + 1;
				high = high;
			}

		}
		return -1;

	}
	/*===============================================================================================================*/
	/*
	 * @Purpose BinarySearchString
	 * 
	 * @para String Array
	 * 
	 * @para String key
	 * 
	 * @return int
	 */

	public int BinarySearchString(String s[], String key) {
		int low = 0;
		int high = s.length;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (s[mid].compareTo(key) < 0) {
				low = mid + 1;
			} else if (s[mid].compareTo(key) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}
	/*===============================================================================================================*/
	/*
	 * @Purpose BinarySearchString
	 * 
	 * @para String Array
	 * 
	 * @para String key
	 * 
	 * @return int
	 */
	public static void isInsertionSortString(String a[]) {

		System.out.println("before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

	}
	/*===============================================================================================================*/
	public static void insertionSortInteger(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int t = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > t) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = t;

		}
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

	}
	
	/*===============================================================================================================*/
	/*
	 * @Purpose bubbleSortInteger
	 * @para int Array
	 * 
	 * 
	 */
	public static void bubbleSort(int a[]) {
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
				}
			}
		}

		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	/*===============================================================================================================*/
	/*
	 * @Purpose bubbleSortString
	 * 
	 * @para String stringArray[]
	
	 * @return String[]
	 */
	public static String[] bubbleSortString(String stringArray[]) {
String temp;
		
		for (int i = 0; i < stringArray.length; i++) 
		{
			for (int j = i+1; j < stringArray.length; j++) 
			{
				if(stringArray[i].compareToIgnoreCase(stringArray[j])>0)
				{
					temp=stringArray[i];
					stringArray[i]=stringArray[j];
					stringArray[j]=temp;
				}
				
			}
			
		}
		return stringArray;

		}
		

	/*===============================================================================================================*/
	/*
	 * @Purpose isMonthSalary
	 * 
	 * @para int p= principal
	 * @para int R= rate
	 * @para int y= year
	 * 
	 * @return double
	 */
	public static double isMonthlySalary(int p, double R, int y) {
		double n = 12 * y;
		double r = R / (12 * 100);
		double payment;

		payment = p * r / (1 - Math.pow(1 + r, -n));

		return payment;
	}

	/*
	 * @Purpose isLeapYear
	 * 
	 * @para int n = year
	 * 
	 * @return boolean
	 */
	/*===============================================================================================================*/
	public static boolean isLeapYear(int n) {
		if (n > 999 && n <= 9999) {
			if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) // formula
			{
				// System.out.println(n+" is a leap year ");
				return true;
			} else {
				// System.out.println(n+" is not a leap year");
				return false;
			}
		} else {
			// System.out.println("invalid year");
			return false;
		}

	}
	/*===============================================================================================================*/
	/*
	 * @Purpose find day
	 * 
	 * @para int m0 = month
	 * 
	 * @para int d0 = date
	 * 
	 * @para int y0 = year
	 * 
	 * @return int
	 */

	public static int day(int m0, int d0, int y0) {
		y0 = y0 - (14 - m0) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = m0 + 12 * ((14 - m0) / 12) - 2;
		d0 = (d0 + x + 31 * m0 / 12) % 7;
		return d0;

	}

}
