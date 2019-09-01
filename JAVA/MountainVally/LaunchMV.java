package MountainVally;
import java.util.*;

public class LaunchMV {


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length Element");
		int n=s.nextInt();
		System.out.println("Enter uphill and downhill U and D ");
		String a=s.nextLine();
		
		MV m=new MV();
		m.mv(n, a);

	}

}
