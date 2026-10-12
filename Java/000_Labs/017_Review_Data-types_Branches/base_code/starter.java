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
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String r = sc.nextLine();
		if(r.equals("Wizard")){
		System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(r.equals("Warrior")){
		System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(r.equals("Rogue")){
		System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
		System.out.println("You've decided not to choose a role.");
		}
		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following:");
		System.out.println("Strength, Dexterity, Intelligence, and Charisma. Spend them wisely");
		System.out.println("");
		int pts = 20;
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		if((Strength>10)||(Strength>pts)){
		System.out.println("Please input a smaller value. Strength(1-10): ");
		Strength = sc.nextInt();
		}
		pts = (pts-Strength);
		System.out.println("You have "+pts+" to spend.");
		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int Dext = sc.nextInt();
		if((Dext>10)||(Dext>pts)){
		System.out.print("Please input a smaller value. Dexterity(1-10): ");
		Dext = sc.nextInt();
		}
		pts = (pts-Dext);
		System.out.println("You have "+pts+" to spend.");
		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int Intel = sc.nextInt();
		if((Intel>10)||(Intel>pts)){
		System.out.print("Please input a smaller value. Intelligence(1-10): ");
		Intel = sc.nextInt();
		}
		pts = (pts-Intel);
		System.out.println("You have "+pts+" to spend.");
		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int Char = sc.nextInt();
		if((Char>10)||(Char>pts)){
		System.out.print("Please input a smaller value. Charisma(1-10): ");
		Char = sc.nextInt();
		}
		if(pts>0){
		System.out.println("You have "+pts+" points to spend for next time.");
		}
		System.out.println("----------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("You're a "+r+" with the following stats!");
		System.out.println("Strength - "+Strength);
		System.out.println("Dexterity - "+Dext);
		System.out.println("Intelligence - "+Intel);
		System.out.println("Charisma - "+Char);
		System.out.println("");
		System.out.println("Good luck on your quest "+name+"!");
	}
}
