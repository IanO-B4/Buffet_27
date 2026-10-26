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
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width: "); 
		int width = sc.nextInt();
		System.out.print("Please enter a height: ");
		int height = sc.nextInt();
		int x = 0;
		int y = 1;
		while(x<width){
			System.out.print("*");
			x++;
		}
		while(y<height){
		System.out.println("");
		y++;
		x=0;
		while(x<width){
			System.out.print("*");
			x++;
		}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------------");
	}
}
