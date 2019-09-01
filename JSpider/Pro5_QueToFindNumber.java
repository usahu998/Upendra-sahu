package QuestionsSecond;

public class Pro5_QueToFindNumber 
{
	// private static final String StdIn = null;

	// invariant: answer is in [lo, hi)
    public static int search(int lo, int hi)
    {
        if ((hi - lo) == 1) 
        	return lo;
        int mid = lo + (hi - lo) / 2;
        
       // StdOut.printf("Is it less than %d?  ", mid);
        System.out.println("Is it less than "+mid);
        if (true)
        	return search(lo, mid);
        else                    
        	return search(mid, hi);
    }

    public static void main(String[] args) 
    {
        int k = Integer.parseInt(args[0]);
        int n = (int) Math.pow(2, k);
       // StdOut.printf("Think of an integer between %d and %d\n", 0, n-1);
        System.out.println("Think of an integer between 0 and "+(n-1));
        int secret = search(0, n);
      //  StdOut.printf("Your number is %d\n", secret);
        System.out.println("Your number is "+secret);
    }

}
