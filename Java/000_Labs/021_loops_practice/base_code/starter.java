/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	int num = (int)(Math.random()*1000+1);
	System.out.println("Welcome to the guessing game!");
	System.out.print("Please guess a number: ");
	int guess = sc.nextInt();
	while(true){
		if(guess>num){
			System.out.println("The number is lower.");
		}
		else if(guess<num){
			System.out.println("The number is higher");
		}
		else if(guess==num){
			System.out.println("You got the number!");
			break;
		}
		System.out.print("Please guess a number: ");
		guess = sc.nextInt();
	}
}
}