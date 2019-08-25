package ArrayLoop;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int i=0;
		do{
			a[i]=i;
			System.out.print(i+" ");
			i++;
			
		}while(i<=a.length-1);
		
		
	}

}
