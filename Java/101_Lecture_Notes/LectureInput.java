/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
    Scanner sc = new Scanner(System.in);
    System.out.println("🍕 Welcome to Mama Mia Pizzeria 🍕");
    System.out.println("Here's our menu:");
    double CpPrice = 0.99;
    double PpPrice = 1.99;
    double BsPrice = 1.50;
    double DrinkPrice = 0.99;
    System.out.println("1. Cheese Slice - $"+CpPrice);
    System.out.println("2. Pepperoni Slice - $"+PpPrice);
    System.out.println("3. Bread Sticks - $"+BsPrice);
    System.out.println("4. Fountain Drink - $"+DrinkPrice);
    System.out.println("");
    System.out.println("How many cheese slices would you like?");
    int CpQuant = sc.nextInt();
    System.out.println("How many pepperoni slices would you like?");
    int PpQuant = sc.nextInt();
    System.out.println("How many bread sticks would you like?");
    int BsQuant = sc.nextInt();
    System.out.println("How many drinks would you like?");
    int DrinkQuant = sc.nextInt();
    double total = ((CpPrice*CpQuant)+(PpPrice+PpQuant)+(BsPrice+BsQuant)+(DrinkPrice+DrinkQuant));
    System.out.println("How much would you like to tip?");
    double tip = sc.nextDouble();
    System.out.println("");
    System.out.println("Your total is: "+(total+(tip/100*total)));

	}
}
