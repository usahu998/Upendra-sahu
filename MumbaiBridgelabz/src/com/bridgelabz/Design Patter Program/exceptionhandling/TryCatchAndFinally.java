package com.bridgelabz.designPatternProgram.exceptionhandling;

public class TryCatchAndFinally {
	// for showing the divide by zero exception

		public static int divide(int a, int b) {
			int div;
			div = a / b;

			return div;
		}

		public static int computeDivision(int a, int b) {
			int div = 0;

			try {
				div = divide(a, b);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return div;

		}

		public static void main(String[] args) {

			int a = 1;
			int b = 0;

			try {
				computeDivision(a, b);
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				System.out.println("In finally block");
			}

		}

}
