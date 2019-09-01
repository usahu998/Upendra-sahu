import java.util.Scanner;

class AddInput {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no.=");
		int a = sc.nextInt();
		System.out.println("Enter the second no.=");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("addition is=" + c);
	}
}
