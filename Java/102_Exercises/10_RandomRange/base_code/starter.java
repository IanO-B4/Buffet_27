/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int y = sc.nextInt();
		System.out.println("");
		int a = (int)(Math.random()*(y-x)+x);
		int b = (int)(Math.random()*(y-x)+x);
		int c = (int)(Math.random()*(y-x)+x);
		int d = (int)(Math.random()*(y-x)+x);
		int e = (int)(Math.random()*(y-x)+x);
		System.out.println("Your range is "+x+" to "+y+".");
		System.out.println("Here are 5 numbers generated in that range");
		System.out.println(a+", "+b+", "+c+", "+d+", "+e+", ");
	}
}
