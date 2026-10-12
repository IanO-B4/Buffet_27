/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the ASCII museum!");
	System.out.println("What exhibit would you like to view?");
	System.out.println("1. Dinosaurs");
	System.out.println("2. Games");
	System.out.println("3. Cartoons");
	String exhibit = sc.nextLine();
	if(exhibit.equals("Dinosaurs")){
	System.out.println("You are now in the Dinosaurs exhibit!");
	System.out.println("Which piece would you like to see?");
	System.out.println("1. Brontosaurus");
	System.out.println("2. Pterodactyl");
	String piece = sc.nextLine();
	if(piece.equals("Brontosaurus")){
	System.out.println("               __");
	System.out.println("              / _)");
	System.out.println("     _.----._/ /");
	System.out.println("    /         /");
	System.out.println(" __/ (  | (  |");
	System.out.println("/__.-'|_|--|_|");
	System.out.println("Bob the Brontosaurus");
	}
	if(piece.equals("Pterodactyl")){
	System.out.println("          ^");
	System.out.println("         / \\ ");
	System.out.println("  ____   * *   ____");
	System.out.println(" /    \\  | |  /    \\ ");
	System.out.println(" |/------ ⌄ ------\\| ");
	System.out.println("         | |");
	System.out.println("        / ⎺ \\ ");
	System.out.println("Pterry the Pterodactyl");
	}
	}
	else if(exhibit.equals("Games")){
	System.out.println("You are now in the Games exhibit!");
	System.out.println("Which piece would you like to see?");
	System.out.println("1. Isaac");
	System.out.println("2. Pong");
	String piece = sc.nextLine();
	if(piece.equals("Isaac")){
	System.out.println("    /⎺⎺⎺⎺⎺⎺\\ ");
	System.out.println("   |  ◕   ◕ |");
	System.out.println("   |  ||⬭|| |");
	System.out.println("    \\______/ ");
	System.out.println("     U|  |U");
	System.out.println("       UU");
	System.out.println("I'm so sorry");
	}
	if(piece.equals("Pong")){
	System.out.println(" 08    ¦    03");
	System.out.println(" |     ¦      ");
	System.out.println("       ¦      ");
	System.out.println("       ¦    | ");
	}
	}
	else if(exhibit.equals("Cartoons")){
	System.out.println("You are now in the Cartoons exhibit!");
	System.out.println("Which piece would you like to see?");
	System.out.println("1. Simpsons");
	System.out.println("2. Spongebob");
	String piece = sc.nextLine();
	if(piece.equals("Simpsons")){
	System.out.println(" |\\/\\/\\/|  ");
	System.out.println(" |      |  ");
	System.out.println(" |      |  ");
	System.out.println(" | (o)(o)  ");
	System.out.println(" C      _) ");
	System.out.println("  | ,___|  ");
	System.out.println("  |   /    ");
	System.out.println(" /____\\    ");
	System.out.println("/      \\");
	System.out.println("Ay Caramba");
	}
	if(piece.equals("Spongebob")){
	System.out.println("      |⎺⎺⎺⎺⎺⎺⎺⎺⎺⎺|");
	System.out.println("      | (●)  (●) |");
	System.out.println("     ⸦===______  |");
	System.out.println("      |  \\_UU_/  |");
	System.out.println("     /|          |\\");
	System.out.println("    //|⎺⎺⎺⎺/\\⎺⎺⎺⎺|\\\\");
	System.out.println("    O |====\\/====| O");
	System.out.println("      ⎺⎺||⎺⎺⎺⎺||⎺⎺");
	System.out.println("        ||    ||");
	System.out.println("       O=/    \\=O");
	System.out.println("The Bob");
	}
	}
	else{
	System.out.println("That is not an exhibit! Please try again.");
	}
	}
}
