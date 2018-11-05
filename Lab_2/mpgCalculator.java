// Ahmad Turan Naimey
// CS 136L-002
// Lab 2 - Miles Per Gallon Calculator
import java.util.Scanner;

public class mpgCalculator
{
  public static void main (String [] args)
  {
    //This program calculates miles per gallon with a given input of miles driven and gallons consumed
    //Declaraction of variables
    String gallonsst;
    String milesst;

    //Input statements
    Scanner scanner = new Scanner(System.in);
    System.out.println("This program calulates miles per gallon");
    System.out.print("Enter miles: ");
    milesst = scanner.next();
    double miles = Double.parseDouble(milesst);
    System.out.print("Gallons of gas consumed: ");
    gallonsst = scanner.next();
    //Calculations for miles per gallon
    double gallons = Double.parseDouble(gallonsst);
    double mpg = miles/gallons;
    //Displays answer
    System.out.print("Volume: ");
    System.out.println(mpg);

  }
}
