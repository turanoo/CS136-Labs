// Ahmad Turan Naimey
// CS 136L-001
// Lab 1 - MadLib
import java.util.Scanner;
// Imports Scanner
// A simple text scanner which can parse primitive types and strings using regular expressions.
class MadLib
// Class Madlib holds the pacakges of our program
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Constructor of Scanner class with argument System.in,
        // and will return a reference to newly constructed object.
        System.out.print("Type a verb: ");
        // asks the user for the input that will be used later
        String first_verb = scanner.next();
        // Gets the input from previous line and sets to a new variable called first_verb
        // The rest of the lines follow the same procedure mentioned in the lines above
        System.out.print("Type an adjective: ");
        String first_adjective = scanner.next();
        System.out.print("Type a plural noun: ");
        String first_noun = scanner.next();
        System.out.print("Type an adjective: ");
        String second_adjective = scanner.next();
        System.out.print("Type a verb ending in 'ing': ");
        String second_verb = scanner.next();
        System.out.print("Type a verb: ");
        String third_verb = scanner.next();
        System.out.print("Type a number: ");
        String first_number = scanner.next();
        System.out.print("Type an adjective: ");
        String third_adjective = scanner.next();
        System.out.print("Type a plural noun: ");
        String second_noun = scanner.next();
        System.out.print("Type a noun: ");
        String third_noun = scanner.next();
        System.out.print("Type a noun: ");
        String fourth_noun = scanner.next();
        System.out.print("Type a plural noun: ");
        String fifth_noun = scanner.next();
        System.out.print("Type an adjective: ");
        String fourth_adjective = scanner.next();
        System.out.print("Type an adjective: ");
        String fifth_adjective = scanner.next();
        System.out.print("Type a noun: ");
        String sixth_noun = scanner.next();


        System.out.println("My First Mad Lib Story in Java");
        System.out.println("**======================**");
        // Below are a series of pre-written sentence that will use variables filled by
        //  the user to make our MadLib
        System.out.println("Come, " + first_verb + " at WALMART, where you'll receive " +
            first_adjective +  " discounts on all of your\nfavorite brandname " + first_noun + ".");

        System.out.println("Our " + second_adjective + ", and " + second_verb + " associates are there to " + third_verb + " you "
        + first_number + " hours a day." );
        System.out.println("Here you will find " + third_adjective + " prices on the " + second_noun + " you need.");
        System.out.println(third_noun + " for the moms, " + fourth_noun + " for the kids and all the latest electronics for the \n" + fifth_noun + ".");
        System.out.println("So come on down to your " + fourth_adjective + ", " + fifth_adjective + " WALMART where the " + sixth_noun + " comes first."  );
    }
}
