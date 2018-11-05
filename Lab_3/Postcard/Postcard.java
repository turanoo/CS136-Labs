// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Postcard Class
public class Postcard
{
  private String message; // declaring variables with the right datatype
  private String sender;
  private String recipient;

 public Postcard(String aSender, String aMessage) //Constructor
 {
   message = aMessage;
 sender = aSender;
 recipient = "";
 }
 public void print() // Method to combine the pieces and print
 {
   System.out.println("Dear " + recipient + ": " + message + "\nLove, \n" + sender);
 }
 public void setRecipient(String name)
 {
   recipient = name;
 }
 }
