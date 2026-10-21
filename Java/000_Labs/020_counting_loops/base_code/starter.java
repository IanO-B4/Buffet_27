/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How many times would you like your name to be printed?");
	int condition = sc.nextInt();
	int x = 0;
	while(true){
		if(x==condition){
		break;	
		}
		System.out.println(name);
		x = x+1;
	}
		
	}
}
