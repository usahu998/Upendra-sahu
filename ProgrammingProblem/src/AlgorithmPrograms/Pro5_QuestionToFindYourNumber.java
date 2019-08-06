package AlgorithmPrograms;
import java.util.Scanner;
public class Pro5_QuestionToFindYourNumber 
{
	 static Scanner sc=new Scanner(System.in);
	    public static int search(int lo, int hi)
	    {
	        if ((hi - lo) == 1) 
	        	return lo;
	        int mid = (lo+hi) / 2;
	        System.out.println("Is it less than "+mid);
	        boolean rs=sc.nextBoolean();
	        if (rs)
	        	return search(lo, mid);
	        else                    
	        	return search(mid, hi);
	    }

	    public static void main(String[] args) 
	    {
	    	
	    	System.out.println("Enter any number");
	    	int k=sc.nextInt();
	        int n = (int) Math.pow(2, k);
	        System.out.println("Think of an integer between 0 and "+(n-1));
	        int secret = search(0, n);
	        System.out.println("Your number is "+secret);
	    }

	}

