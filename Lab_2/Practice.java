// Ahmad Turan Naimey
// CS 136L-002
// Lab 2 - Practice Java Fundamentals
import java.util.Scanner;

public class Lab02
{
   public static void main (String [] args)
   {
      //Constants:
      // final means the values don't change and remain the same
      final int NUMBER_OF_SCORES = 2 ; 			// Number of test scores
      final int SCORE_1 = 100;    				// Score of first test
      final double SCORE_2 = 95;     				// Score of second test
      final int BOILING_IN_FAHRENHEIT= 212;  	// Boiling in Fahrenheit
      // We are initializing our variables with the right and suitable data Type
	  //Variables:
	  double tempCelsius;                  // Temperature in celsius degrees
      double average;            		// Average of two numbers
      String outputLine;            //string for average grade
      String firstName;
      String lastName;
      String initial;
      String uppercaseName;
      String radius;
      double volume;            // Since volume is going to be a decimal
                                // we initialize it as a double


	  //Declare variables used for task 2 here
      //Declare variables used for task 3 here
      //Declare variables used for task 4 here

      // Caclulate the average of two integers
      average = (SCORE_1 + SCORE_2) / NUMBER_OF_SCORES;
      outputLine = SCORE_1 + " and " + SCORE_2 + " have an average of " + average;
      System.out.println(outputLine);

      // Convert Fahrenheit temperatures to Celsius
      tempCelsius = (5.0/9.0) * (BOILING_IN_FAHRENHEIT - 32);
      System.out.println(tempCelsius);
      String result = BOILING_IN_FAHRENHEIT + " in Fahrenheit is " + tempCelsius + " in Celsius";
      //System.out.println(result);

      System.out.println();      // Adds a blank line

      // This section uses scanner to ask for user input of 1st name and last name. Then prints fullName

      Scanner scanner = new Scanner(System.in);
      System.out.print("Type First Name: ");
      firstName = scanner.next();
      System.out.print("Type Last Name: ");
      lastName = scanner.next();
      String fullName = (firstName + " " + lastName);
      System.out.println(fullName);

      // Task 3
      // name in all capital letter and the initials for name.
      System.out.println();      // Adds a blank line
      initial =  Character.toString (firstName.charAt(0));
      System.out.println(initial);
      uppercaseName = fullName.toUpperCase();
      System.out.println(uppercaseName);


      // Add code for task 4 here
      // Asks user to input radius of sphere. Takes radius and calculates the volume of a sphere with input radius
      System.out.println();      // Adds a blank line
      System.out.print("Radius of Sphere: ");
      radius = scanner.next();
      double radius1 = Double.parseDouble(radius);
      volume = (4.0/3.0) * Math.PI * Math.pow(radius1, 3);
      System.out.print("Volume: ");
      System.out.println(volume);
   }
}
