/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = (int)Math.random()*9;
		System.out.println("A number between 0 - 9: "+a);
		int b = (int)Math.random()*9+1;
		System.out.println("A number between 1 - 10: "+b);
		double c = Math.random()*1+2.5;
		System.out.println("A number between 2.5 and 3.5: "+c);
		double d = Math.random()*575+14;
		System.out.println("A double between 14 and 589: "+d);
		
	}
}
