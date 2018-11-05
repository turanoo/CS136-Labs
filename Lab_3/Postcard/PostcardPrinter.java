// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Postcard Printer Class
public class PostcardPrinter
{
 public static void main(String[] args)
 {
 String text = "I am having a great time on\ndirthe island of Java. Weather\nis great. Wish you were here!";
 Postcard postcard = new Postcard("Janice", text);
 postcard.setRecipient("Sue");
 postcard.print();
 postcard.setRecipient("Tim");
 postcard.print();
 }
}
