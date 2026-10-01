/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        System.out.println("Random color: rgb("+r+", "+g+", "+b+")");
        getColor(r, g, b);
        int compR = 255-r;
        int compG = 255-g;
        int compB = 255-b;
        System.out.println("Complimentary: rgb("+compR+", "+compG+","+compB+")");
        getColor(compR, compG, compB);
        System.out.println("Triadic Colors:");
        getColor(r, g, b);
        getColor(b, r, g);
        getColor(g, b, r);
        int darkr = (int)(Math.random()*129);
        int darkg = (int)(Math.random()*129);
        int darkb = (int)(Math.random()*129);
        System.out.println("Darker color:");
        getColor(darkr, darkg, darkb);
        int lightr = (int)(Math.random()*256+128);
        int lightg = (int)(Math.random()*256+128);
        int lightb = (int)(Math.random()*256+128);
        System.out.println("Lighter Color:");
        getColor(lightr, lightg, lightb);
		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        
    }
}
